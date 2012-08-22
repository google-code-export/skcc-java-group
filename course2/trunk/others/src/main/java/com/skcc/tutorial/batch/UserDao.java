package com.skcc.tutorial.batch;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

@Repository
public class UserDao extends SqlMapClientDaoSupport {
	
	@Resource
	public void init(SqlMapClient sqlMapClient){
		setSqlMapClient(sqlMapClient);
	}
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers(){
		return getSqlMapClientTemplate().queryForList("selectUser");
	}
	
	public User getUser(String name){
		return (User) getSqlMapClientTemplate().queryForObject("selectUser", name);
	}
	
	public User createUser(User user) throws SQLException{
		return (User) getSqlMapClient().insert("insertUser", user);
	}
}
