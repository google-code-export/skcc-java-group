package com.skcc.tutorial.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public class HelloImpl implements Hello {
	private static final Logger logger = LoggerFactory.getLogger(HelloImpl.class);
	/* (non-Javadoc)
	 * @see com.skcc.tutorial.cache.Hello#sayHello(java.lang.String)
	 */
	@Override
	@Cacheable(value="hello")
	public String sayHello(String name){
		logger.debug("Hello Service invoked");
		return "Hello, "+name;
	}
	/* (non-Javadoc)
	 * @see com.skcc.tutorial.cache.Hello#clearCache()
	 */
	@Override
	@CacheEvict(value = "hello", allEntries = true)
	public void clearCache(){
		logger.debug("Hello cache cleared");
	}
}
