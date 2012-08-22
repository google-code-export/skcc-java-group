package com.skcc.tutorial.async;

import java.util.Date;

import org.apache.commons.lang.math.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class PrintNumberService {
	private static final Logger logger = LoggerFactory.getLogger(PrintNumberService.class);
	
	@Async
	public void printNumber(int number){
		logger.info("# {}", number);
	}
	@Scheduled(fixedRate=1000)
	public void printRandomNumber(){
		logger.info("# {}", RandomUtils.nextInt(3));
	}
	@Scheduled(fixedRate=1000)
	public void printFixedNumber(){
		logger.info("# {}", 1);
	}	
}
