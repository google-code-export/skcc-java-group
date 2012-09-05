package egovframework.lab.ajax.service;

import egovframework.lab.com.vo.Account;

public interface LoginService {
	
	public Account authenticate(String id, String password) throws Exception ;	
}
