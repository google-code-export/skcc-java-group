package com.skcc.javagroup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skcc.javagroup.myweb.BasicUserService;
import com.skcc.javagroup.myweb.UserService;
import com.skcc.javagroup.myweb.UserServiceFactory;

public class UserServiceClient {

	ApplicationContext context = new ClassPathXmlApplicationContext("myfirst-context.xml"); 
	
	public static void main(String[] args){
		UserServiceClient userServiceClient = new UserServiceClient();
		
		// #1. 직접 User Service 생성
		userServiceClient.printUser("kim");
		
		// #2. Using Factory
		userServiceClient.printUserWithFactory("kim");
		
		// #3. Using Spring
		userServiceClient.printUserWithSpring("kim");
		
	}
	private void printUser(String username) {
		// Tight dependency to UserService implementation. 
		UserService userService = new BasicUserService();

		System.out.println(userService.getUser(username));
	}
	private void printUserWithFactory(String username){
		// No direct dependency to UserService implementation. but still need to implement the Factory.
		UserService userService = UserServiceFactory.getUserService();

		System.out.println(userService.getUser(username));
	}
	private void printUserWithSpring(String username){
		// No direct dependency. implementation can be switched in Spring configuration. 
		UserService userService = context.getBean(UserService.class);

		System.out.println(userService.getUser(username));
	}
}
