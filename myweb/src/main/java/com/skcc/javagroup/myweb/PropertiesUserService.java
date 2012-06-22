package com.skcc.javagroup.myweb;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PropertiesUserService implements UserService{

	List<User> users = new ArrayList<User>(); 
	public PropertiesUserService(){
		ResourceBundle bundle = ResourceBundle.getBundle("users");
		int i=0;
		for(String key:bundle.keySet()){
			users.add(new User(i++, key, bundle.getString(key)));
		}
	}
	@Override
	public User getUser(String userName) {
		User result = null;
		for(User user:users){
			if(user.getName().equals(userName)) result = user;
		}
		if(result == null) throw new RuntimeException("No user found for username "+userName);
		return result;
	}	
}
