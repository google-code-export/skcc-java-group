package egovframework.lab.ajax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.lab.ajax.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;	
	

	public List<String> getNameListForSuggest(String namePrefix) {
		return employeeDao.getNameListForSuggest(namePrefix);
	}

}
