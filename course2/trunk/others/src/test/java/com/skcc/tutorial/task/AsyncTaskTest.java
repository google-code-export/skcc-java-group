package com.skcc.tutorial.task;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.skcc.tutorial.async.PrintNumberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:task-context.xml")
public class AsyncTaskTest {

	@Resource
	private PrintNumberService asyncTask;
	
	@Test
	public void asyncTaskTest() throws InterruptedException{
		for (int i = 0; i < 100; i++) {
			asyncTask.printNumber(i);
		}
		Thread.sleep(1000);
	}
	
	@Test
	public void scheduledTaskTest() throws InterruptedException {
		Thread.sleep(5000);
	}
	
}
