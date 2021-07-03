package com.mcronalds.order;

import java.util.Optional;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mcronalds.order.controller.impl.UpdateOrderStatusImpl;
import com.mcronalds.order.exceptions.OrderUpdateException;
import com.mcronalds.order.model.OrderStatus;
import com.mcronalds.order.service.IOrderUpdateService;

@WebMvcTest(UpdateOrderStatusImpl.class)
@AutoConfigureMockMvc
class OrderUpdateControllerTest {

	private static final ObjectMapper objectMapper = new ObjectMapper();

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private IOrderUpdateService orderUpdateService;

	@InjectMocks
	private UpdateOrderStatusImpl uodatOrderStatusImpl;

	@Test
	public void testUpdateOrderStatus() throws JsonProcessingException, Exception {

		OrderStatus orderStatus = new OrderStatus();
		orderStatus.setOrderStatus("placed");

		Mockito.when(orderUpdateService.updateOrderStatus(Mockito.any(String.class), Mockito.any(OrderStatus.class)))
				.thenReturn(Optional.of(true));

		mockMvc.perform(
				MockMvcRequestBuilders.put("/v1/updateOrderStatus/123").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(orderStatus)))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.code", Matchers.is("0000")));

	}
	
	@Test
	public void testUpdateOrderStatus_invalidStatusInput() throws JsonProcessingException, Exception {

		OrderStatus orderStatus = new OrderStatus();
		orderStatus.setOrderStatus("placed_order");

		Mockito.when(orderUpdateService.updateOrderStatus(Mockito.any(String.class), Mockito.any(OrderStatus.class)))
				.thenReturn(Optional.of(true));

		mockMvc.perform(
				MockMvcRequestBuilders.put("/v1/updateOrderStatus/123").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(orderStatus)))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.code", Matchers.is("1000")));
	}
	
	@Test
	public void testUpdateOrderStatus_invalidOrderID() throws JsonProcessingException, Exception {

		OrderStatus orderStatus = new OrderStatus();
		orderStatus.setOrderStatus("completed");

		Mockito.when(orderUpdateService.updateOrderStatus(Mockito.any(String.class), Mockito.any(OrderStatus.class)))
				.thenReturn(Optional.of(true));

		mockMvc.perform(
				MockMvcRequestBuilders.put("/v1/updateOrderStatus/abc").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(orderStatus)))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.code", Matchers.is("1000")));
	}
	
	@Test
	public void testUpdateOrderStatus_exception() throws JsonProcessingException, Exception {

		OrderStatus orderStatus = new OrderStatus();
		orderStatus.setOrderStatus("wip");

		Mockito.when(orderUpdateService.updateOrderStatus(Mockito.any(String.class), Mockito.any(OrderStatus.class)))
				.thenThrow(new OrderUpdateException());

		mockMvc.perform(
				MockMvcRequestBuilders.put("/v1/updateOrderStatus/123").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(orderStatus)))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.code", Matchers.is("5000")));

	}

}
