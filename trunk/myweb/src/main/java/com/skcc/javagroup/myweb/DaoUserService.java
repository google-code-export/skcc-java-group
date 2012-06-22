package com.skcc.javagroup.myweb;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class DaoUserService implements UserService {
	@Resource
	private UserDao dao;
	
	/* (non-Javadoc)
	 * @see com.skcc.javagroup.myweb.UserService#getUser(java.lang.String)
	 */
	@Override
	public User getUser(String userName){
		return dao.getUser(userName);
	}
}
