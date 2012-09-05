package egovframework.lab.ajax.service;

import java.util.List;
import java.util.Map;

import egovframework.lab.com.vo.Department;

public interface DepartmentService {
	
	@SuppressWarnings("unchecked")
    public List<Department> getDepartmentList(Map param);
	
	public Map<String, String> getDepartmentIdNameList(String depth);
	
	public Map<String, String> getDepartmentIdNameList(String depth, String superdeptid);
//	
//	public Department getDepartmentInfoById(String id);
//	
//	public int updateDepartment(Department department);
	
}
