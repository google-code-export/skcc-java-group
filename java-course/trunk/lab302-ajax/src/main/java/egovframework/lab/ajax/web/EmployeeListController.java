package egovframework.lab.ajax.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.lab.ajax.service.DepartmentService;
import egovframework.lab.com.vo.Employee;
import egovframework.lab.com.vo.SearchCriteria;

@Controller
public class EmployeeListController {


	@Autowired
	private DepartmentService departmentService;

	@RequestMapping(value = "/employeelist.do")
	public String getEmpList(SearchCriteria searchCriteria, ModelMap model) throws Exception {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employeelist";
	}

	@SuppressWarnings("unused")
	@ModelAttribute("deptInfoOneDepthCategory")
	private Map<String, String> referenceDataOneDepthDept() {
		return departmentService.getDepartmentIdNameList("1");
	}

}