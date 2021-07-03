package com.mcronalds.order.validator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mcronalds.order.exceptions.InvalidInputException;
import com.mcronalds.order.model.Order.OrderStatusEnum;
import com.mcronalds.order.model.OrderStatus;

//
public class UpdateOrderStatusValidator {

	public static boolean validate(String orderID, OrderStatus orderStatus) {

		if (hasOnlyDigits(orderID) && validOrderStatus(orderStatus)) {
			return true;
		}
		return false;
	}

	private static boolean validOrderStatus(OrderStatus orderStatus) {
		if (orderStatus != null && orderStatus.getOrderStatus() != null) {

			Arrays.asList(OrderStatusEnum.values()).stream()
					.filter(status -> status.getStatus().equalsIgnoreCase(orderStatus.getOrderStatus())).findAny()
					.orElseThrow(() -> new InvalidInputException());
			
			return true;

		}
		return false;
	}

	// validate if order has only digits
	public static boolean hasOnlyDigits(String str) {

		String regex = "[0-9]+";
		Pattern p = Pattern.compile(regex);
		if (str == null) {
			return false;
		}
		Matcher m = p.matcher(str);
		return m.matches();
	}

}
