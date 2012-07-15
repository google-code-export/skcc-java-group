package com.skcc.javagroup.myweb;

public class UserServiceFactory {
	public static UserService getUserService(){
		return new BasicUserService();
	}
	public static UserService getUserService(UserServiceType userServiceType){
		switch (userServiceType) {
		case Basic:
			return new BasicUserService();
		case Properties:
			return new PropertiesUserService();
		}
		return null;
	}
	public enum UserServiceType{
		Basic, Properties
	}
}
