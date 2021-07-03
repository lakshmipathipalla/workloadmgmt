package com.mcronalds.order.exceptions;

public class InvalidInputException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidInputException() {
		super("Invalid input");
	}

}
