package com.mcronalds.order.exceptions;

public class OrderNotFountException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderNotFountException() {
		super("Order not found");
	}
}
