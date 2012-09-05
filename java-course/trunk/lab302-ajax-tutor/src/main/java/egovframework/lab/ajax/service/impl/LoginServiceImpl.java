package egovframework.lab.ajax.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.lab.ajax.service.LoginService;
import egovframework.lab.com.vo.Account;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginDao loginDao;
	
	public Account authenticate(String id, String password) throws Exception {
		return loginDao.authenticate(id, password);
	}
	
}
