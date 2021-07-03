package com.mcronalds.order.controller.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mcronalds.order.controller.IUpdateOrderStatus;
import com.mcronalds.order.exceptions.InvalidInputException;
import com.mcronalds.order.model.Header;
import com.mcronalds.order.model.OrderStatus;
import com.mcronalds.order.service.IOrderUpdateService;
import com.mcronalds.order.validator.UpdateOrderStatusValidator;

@RestController
public class UpdateOrderStatusImpl implements IUpdateOrderStatus {

	public static final Logger LOGGER = LoggerFactory.getLogger(UpdateOrderStatusImpl.class);

	@Autowired
	IOrderUpdateService orderUpdateService;

	//This method will be used to update the order status
	public ResponseEntity<Header> updateOrderStatus(@PathVariable("orderID") String orderID,
			@RequestBody OrderStatus orderStatus) {

		LOGGER.info("Recieved order update request with id:{} and status:{}",orderID , orderStatus.getOrderStatus());
		Header header = new Header();

		if (UpdateOrderStatusValidator.validate(orderID, orderStatus)) {
				Optional<Boolean> updateResponse = orderUpdateService.updateOrderStatus(orderID, orderStatus);
				if (updateResponse.isPresent() && updateResponse.get()) {
					header.setCode("0000");
					header.setDescription("Status updated successfully");
				}
		} else {
			throw new InvalidInputException();
		}
		
		LOGGER.info("Completed order status update");

		return new ResponseEntity<Header>(header, HttpStatus.OK);
	}

}
