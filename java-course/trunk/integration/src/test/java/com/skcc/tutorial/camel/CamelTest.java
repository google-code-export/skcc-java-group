package com.skcc.tutorial.camel;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.skcc.tutorial.ws.OrderItemType;
import com.skcc.tutorial.ws.OrderService;
import com.skcc.tutorial.ws.OrderType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:camel-context.xml")
public class CamelTest {

	@Resource
	OrderService orderServiceClient;
	
	@Test
	public void test() throws InterruptedException{
		OrderType order = new OrderType();
		OrderItemType orderItem = new OrderItemType();
		orderItem.setProductId("GallaxyS3");
		orderItem.setQuantity(10);
		order.getOrderItems().add(orderItem);
		
		orderServiceClient.placeOrder(order);
		
		Thread.sleep(3000);
	}
}
