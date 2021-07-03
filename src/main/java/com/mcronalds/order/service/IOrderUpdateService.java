package com.mcronalds.order.service;

import java.util.Optional;

import com.mcronalds.order.model.OrderStatus;

public interface IOrderUpdateService {

	Optional<Boolean> updateOrderStatus(String orderID, OrderStatus orderStatus);

}
