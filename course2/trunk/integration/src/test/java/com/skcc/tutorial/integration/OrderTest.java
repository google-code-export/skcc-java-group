package com.skcc.tutorial.integration;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.skcc.tutorial.ws.OrderItemType;
import com.skcc.tutorial.ws.OrderService;
import com.skcc.tutorial.ws.OrderType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:integration-context.xml")
public class OrderTest {

	@Resource
	OrderService orderServiceClient;
	
	@Test
	public void testOrder() throws InterruptedException{
		OrderType order = new OrderType();
		OrderItemType orderItem = new OrderItemType();
		orderItem.setProductId("GallaxyS3");
		orderItem.setQuantity(10);
		order.getOrderItems().add(orderItem);
		
		String orderId = orderServiceClient.placeOrder(order);
		
		OrderType result = orderServiceClient.findOrder(orderId);
		
		Assert.assertEquals("GallaxyS3", result.getOrderItems().get(0).getProductId());
		
		Thread.sleep(9999999);
	}
	
	
}
