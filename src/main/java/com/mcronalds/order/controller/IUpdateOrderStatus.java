package com.mcronalds.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mcronalds.order.model.Header;
import com.mcronalds.order.model.OrderStatus;

@RequestMapping(value = "/v1")
public interface IUpdateOrderStatus {
	//This method is used to update the order status
	@RequestMapping(value = "/updateOrderStatus/{orderID}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	ResponseEntity<Header> updateOrderStatus(@PathVariable("orderID") String orderID, @RequestBody OrderStatus body);

}
