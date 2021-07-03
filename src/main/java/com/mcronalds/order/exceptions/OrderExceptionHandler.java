package com.mcronalds.order.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mcronalds.order.model.Header;

@ControllerAdvice
public class OrderExceptionHandler {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(OrderExceptionHandler.class);
	
	//handles if no order is present
	@ExceptionHandler(value = OrderNotFountException.class)
	public ResponseEntity<Header> orderNotFoundException(OrderNotFountException orderNotFountException){
		
		Header header = new Header();
		header.setCode("1002");
		header.setDescription("Not able to find the given order");
		LOGGER.error(orderNotFountException.getMessage(), orderNotFountException);
		return new ResponseEntity<Header>(header, HttpStatus.OK);
	}
	
	//handles if any error occurs while updating
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Header> orderUpdateException(Exception orderUpdateException){
		
		Header header = new Header();
		header.setCode("5000");
		header.setDescription("Status update failed for order");
		LOGGER.error(orderUpdateException.getMessage(), orderUpdateException);
		return new ResponseEntity<Header>(header, HttpStatus.OK);
	}
	
	//handles if the input is not valid
	@ExceptionHandler(value = InvalidInputException.class)
	public ResponseEntity<Header> invalidInputException(InvalidInputException invalidInputException){
		
		Header header = new Header();
		header.setCode("1000");
		header.setDescription("Invalid request");
		LOGGER.error(invalidInputException.getMessage(), invalidInputException);
		return new ResponseEntity<Header>(header, HttpStatus.OK);
	}

}
