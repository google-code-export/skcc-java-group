package com.skcc.tutorial.ws;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderServiceImpl implements OrderService{
	private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
	private Map<String, OrderType> orderMap = new HashMap<String, OrderType>();
	
	@Override
	public String placeOrder(OrderType order) {
		String orderId = new SimpleDateFormat("yyMMddHHmmss").format(System.currentTimeMillis());
		logger.info("Order {} is placed.", orderId);
		order.setOrderId(orderId);
		orderMap.put(orderId, order);
		return orderId;
	}

	@Override
	public OrderType findOrder(String orderId) {
		return orderMap.get(orderId);
	}

}
