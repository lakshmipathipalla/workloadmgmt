package com.mcronalds.order.exceptions;

public class OrderUpdateException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public OrderUpdateException() {
		super("Exception occured while updating order status");
	}

}
