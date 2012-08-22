package com.skcc.tutorial.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloJob implements Job{
	private static final Logger logger = LoggerFactory.getLogger(HelloJob.class);
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		logger.info("Hello, "+arg0.getJobDetail().getJobDataMap().get("name"));
	}

}
