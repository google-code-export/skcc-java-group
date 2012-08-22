package com.skcc.tutorial.cache;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class HelloCacheTest {
	private static final Logger logger = LoggerFactory.getLogger(HelloCacheTest.class);
	@Resource
	Hello helloService;
	
	@Test
	public void helloCacheTest() throws InterruptedException{
		System.out.println("First Call: "+helloService.sayHello("Kim"));
		System.out.println("Second Call: "+helloService.sayHello("Kim"));
		helloService.clearCache();
		System.out.println("Thired Call: "+helloService.sayHello("Kim"));
		System.out.println("After 1.1 sec : ");
		Thread.sleep(1100);
		System.out.println(helloService.sayHello("Kim"));
		Thread.sleep(999);
		System.out.println("After 0.9: "+helloService.sayHello("Kim"));
		Thread.sleep(999);
		System.out.println("After 0.9: "+helloService.sayHello("Kim"));
		Thread.sleep(999);
		System.out.println("After 0.9: "+helloService.sayHello("Kim"));
		Thread.sleep(999);
		System.out.println("After 0.9: "+helloService.sayHello("Kim"));
	}
}
