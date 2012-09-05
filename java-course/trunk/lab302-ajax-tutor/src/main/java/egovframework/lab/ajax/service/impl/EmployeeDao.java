package egovframework.lab.ajax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

@Repository("employeeDao")
public class EmployeeDao extends SqlMapClientDaoSupport {
		
	@Autowired
    public EmployeeDao(SqlMapClient sqlMapClient) {
        super();
        setSqlMapClient(sqlMapClient);
    }
	
	@SuppressWarnings("unchecked")
	public List<String> getNameListForSuggest(String namePrefix){
		return (List<String>)getSqlMapClientTemplate().queryForList("Employee.getNameListForSuggest",namePrefix);
	}



}
