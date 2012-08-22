package com.skcc.tutorial.ws;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:order-context.xml")
public class OrderTest {

	@Resource
	OrderService orderServiceClient;
	
	@Test
	public void testOrder(){
		OrderType order = new OrderType();
		OrderItemType orderItem = new OrderItemType();
		orderItem.setProductId("GallaxyS3");
		orderItem.setQuantity(10);
		order.getOrderItems().add(orderItem);
		
		String orderId = orderServiceClient.placeOrder(order);
		
		OrderType result = orderServiceClient.findOrder(orderId);
		
		Assert.assertEquals("GallaxyS3", result.getOrderItems().get(0).getProductId());
	}
	
	
}
