package com.skcc.tutorial.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public interface Hello {

	public abstract String sayHello(String name);

	public abstract void clearCache();

}