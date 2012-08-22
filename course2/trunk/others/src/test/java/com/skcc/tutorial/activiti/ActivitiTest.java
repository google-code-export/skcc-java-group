package com.skcc.tutorial.activiti;

import javax.annotation.Resource;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.test.ActivitiRule;
import org.activiti.engine.test.Deployment;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:activiti-context.xml")
public class ActivitiTest {
	@Resource
	RuntimeService runtimeService;
	
	@Resource
	HistoryService historyService;
	
	@Resource
	RepositoryService repositoryService;
	
	@Before
	public void before(){
		repositoryService.createDeployment().addClasspathResource("MyProcess.bpmn").deploy();
	}
	
	@Test
	public void test() throws InterruptedException{
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("process1");
		
		for(HistoricActivityInstance activity:historyService.createHistoricActivityInstanceQuery().processInstanceId(processInstance.getId()).list()){
			System.out.println(activity.getActivityName());
		}
	}
}
