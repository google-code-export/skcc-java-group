package com.skcc.javagroup;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.skcc.javagroup.myweb.PropertiesUserService;
import com.skcc.javagroup.myweb.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:myfirst-context.xml")
public class UserServiceClient {

	ApplicationContext context = null; 
	
	@Resource
	UserService userService;
	
	public void initApplicationContext(){
		context = new ClassPathXmlApplicationContext("myfirst-context.xml");
	}
	
	@Test
	public void testGetUserWithJUnit(){
		Assert.assertEquals("111", userService.getUser("kim").getPassword());
		System.out.println(userService.getUser("kim"));
		assert userService.getUser("kim").getPassword() == "1111";
	}
	public void testGetUser(){
		userService = context == null ? new PropertiesUserService():context.getBean(UserService.class);
		System.out.println(userService.getUser("kim"));
	}
	public static void main(String[] args){
		UserServiceClient springTest = new UserServiceClient();
		springTest.initApplicationContext();
		springTest.testGetUser();
	}
}
