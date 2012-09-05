package egovframework.lab.ajax.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.lab.ajax.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl {

    @Resource(name = "employeeDao")
    private EmployeeDao employeeDao;

    // TODO [Step 2-2-6] getNameListForSuggest 메소드를 구현한다.(comment 처리 를 지운다.)
    /*
     public void getNameListForSuggest(String namePrefix) {
     //TODO [Step 2-2-7] employeeDao 의 getNameListForSuggest 메소드를 이용하여 검색한후 결과를   리턴한다.
     }
    */

}
