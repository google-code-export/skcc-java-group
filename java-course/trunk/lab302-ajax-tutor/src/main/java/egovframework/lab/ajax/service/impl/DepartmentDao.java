package egovframework.lab.ajax.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

import egovframework.lab.com.vo.Department;

@Repository("departmentDao")
public class DepartmentDao extends SqlMapClientDaoSupport {
	
	@Autowired
    public DepartmentDao(SqlMapClient sqlMapClient) {
        super();
        setSqlMapClient(sqlMapClient);
    }
	
	@SuppressWarnings("unchecked")
	public List<Department> getDepartmentList(Map param)throws DataAccessException{		
		return (List<Department>)getSqlMapClientTemplate().queryForList("Department.getDepartmentList",param);
	
	}
	

}
