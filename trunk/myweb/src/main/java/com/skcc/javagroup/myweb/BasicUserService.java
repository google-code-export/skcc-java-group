package com.skcc.javagroup.myweb;

import java.util.ArrayList;
import java.util.List;

public class BasicUserService implements UserService {
	private List<User> users = new ArrayList<User>();
	
	public BasicUserService(){
		int i=0;
		users.add(new User(i++, "kim", "1234"));
		users.add(new User(i++, "hong", "1234"));
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
