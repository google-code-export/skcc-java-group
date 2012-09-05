package egovframework.lab.ajax.service.impl;

import javax.naming.AuthenticationException;

import org.springframework.stereotype.Repository;

import egovframework.lab.com.vo.Account;

@Repository("loginDao")
public class LoginDao  { //extends SqlMapClientDaoSupport

//	@Autowired
//	public LoginDao(SqlMapClient sqlMapClient) {
//		super();
//		setSqlMapClient(sqlMapClient);
//	}

	public Account authenticate(String id, String password) throws Exception {
		Account account = new Account();
		account.setEmployeeid(id);
		account.setPassword(password);
		
		// return (Account)getSqlMapClientTemplate().queryForObject("Employee.authenticate",account);


		if (!("1".equalsIgnoreCase(id) && "1".equalsIgnoreCase(password))) {

			throw new AuthenticationException();
		}

		return account;

	}
}