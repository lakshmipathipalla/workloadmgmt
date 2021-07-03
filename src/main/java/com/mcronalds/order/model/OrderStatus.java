package com.mcronalds.order.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrderStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-03T10:15:13.729Z")

public class OrderStatus {
	@JsonProperty("orderStatus")
	private String orderStatus = null;

	public OrderStatus orderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
		return this;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OrderStatus orderStatus = (OrderStatus) o;
		return Objects.equals(this.orderStatus, orderStatus.orderStatus);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderStatus);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OrderStatus {\n");

		sb.append("    itemName: ").append(toIndentedString(orderStatus)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
