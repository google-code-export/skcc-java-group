package com.skcc.tutorial.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class HelloSpringJob extends QuartzJobBean{
	private static final Logger logger = LoggerFactory.getLogger(HelloSpringJob.class);
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		logger.info("Hello, {}", name);
	}

}
