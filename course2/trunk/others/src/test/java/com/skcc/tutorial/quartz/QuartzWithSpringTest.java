package com.skcc.tutorial.quartz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:quartz-context.xml")
public class QuartzWithSpringTest {
	@Test
	public void test() throws InterruptedException{
		Thread.sleep(10*1000);
	}
}
