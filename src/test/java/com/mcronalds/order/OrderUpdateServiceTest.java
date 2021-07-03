package com.mcronalds.order;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mcronalds.order.entities.Order;
import com.mcronalds.order.model.OrderStatus;
import com.mcronalds.order.repository.IOrderUpdateRepository;
import com.mcronalds.order.service.impl.OrderUpdateServiceImpl;

@ExtendWith(MockitoExtension.class)
public class OrderUpdateServiceTest {
	
	@Mock
	private IOrderUpdateRepository orderUpdateRepository;
	
	@Mock
	private Order order;
	
	@InjectMocks
	private OrderUpdateServiceImpl orderUpdateServiceImpl;
	
	@Test
	public void testUpdateOrder() {
		OrderStatus orderStatus = new OrderStatus();
		orderStatus.setOrderStatus("wip");
		 Mockito.when(orderUpdateRepository.findById(Mockito.any(Integer.class))).thenReturn(Optional.of(order));
		 Mockito.doNothing().when(orderUpdateRepository).flush();
		 Optional<Boolean> response = orderUpdateServiceImpl.updateOrderStatus("123", orderStatus);
		 assertNotNull(response.get());
		 assertTrue(response.get());
	}

}
