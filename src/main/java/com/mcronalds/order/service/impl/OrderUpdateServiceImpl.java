package com.mcronalds.order.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcronalds.order.entities.Order;
import com.mcronalds.order.exceptions.OrderNotFountException;
import com.mcronalds.order.model.OrderStatus;
import com.mcronalds.order.repository.IOrderUpdateRepository;
import com.mcronalds.order.service.IOrderUpdateService;

/**
 * 
 * @author lakshmipathi.palla
 *
 */
@Service
public class OrderUpdateServiceImpl implements IOrderUpdateService {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(OrderUpdateServiceImpl.class);

	@Autowired
	private IOrderUpdateRepository orderUpdateRepository;
	
	//service layer which access repostory to update the status
	@Override
	public Optional<Boolean> updateOrderStatus(String orderID, OrderStatus orderStatus) {
		
		LOGGER.info("In order update service");
		
		Optional<Order> updateResponse = orderUpdateRepository.findById(Integer.valueOf(orderID));
		
		if(updateResponse.isPresent()) {
			updateResponse.get().setOrderStatus(orderStatus.getOrderStatus());
			orderUpdateRepository.flush();
		}else {
			LOGGER.error("Order id not found");
			throw new OrderNotFountException();
		}
		return Optional.of(true);
	}
}
