package com.mcronalds.order.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Order
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-03T10:15:13.729Z")

public class Order {
	@JsonProperty("orderNumber")
	private String orderNumber = null;

	@JsonProperty("orderDescription")
	private String orderDescription = null;

	@JsonProperty("quantity")
	private String quantity = null;

	@JsonProperty("productCode")
	private String productCode = null;

	@JsonProperty("productDescription")
	private String productDescription = null;

	@JsonProperty("price")
	private String price = null;

	@JsonProperty("topping")
	private String topping = null;

	/**
	 * Order Status
	 */
	public enum OrderStatusEnum {
		PLACED("placed"),

		WIP("wip"),

		COMPLETED("completed");

		private String value;

		OrderStatusEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static OrderStatusEnum fromValue(String text) {
			for (OrderStatusEnum b : OrderStatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
		
		public String getStatus() {
			return value;
		}
	}

	@JsonProperty("OrderStatus")
	private OrderStatusEnum orderStatus = null;

	public Order orderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
		return this;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Order orderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
		return this;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public Order quantity(String quantity) {
		this.quantity = quantity;
		return this;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Order productCode(String productCode) {
		this.productCode = productCode;
		return this;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Order productDescription(String productDescription) {
		this.productDescription = productDescription;
		return this;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Order price(String price) {
		this.price = price;
		return this;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Order topping(String topping) {
		this.topping = topping;
		return this;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public Order orderStatus(OrderStatusEnum orderStatus) {
		this.orderStatus = orderStatus;
		return this;
	}

	public OrderStatusEnum getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatusEnum orderStatus) {
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
		Order order = (Order) o;
		return Objects.equals(this.orderNumber, order.orderNumber)
				&& Objects.equals(this.orderDescription, order.orderDescription)
				&& Objects.equals(this.quantity, order.quantity) && Objects.equals(this.productCode, order.productCode)
				&& Objects.equals(this.productDescription, order.productDescription)
				&& Objects.equals(this.price, order.price) && Objects.equals(this.topping, order.topping)
				&& Objects.equals(this.orderStatus, order.orderStatus);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderNumber, orderDescription, quantity, productCode, productDescription, price, topping,
				orderStatus);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Order {\n");

		sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
		sb.append("    orderDescription: ").append(toIndentedString(orderDescription)).append("\n");
		sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
		sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
		sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
		sb.append("    price: ").append(toIndentedString(price)).append("\n");
		sb.append("    topping: ").append(toIndentedString(topping)).append("\n");
		sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
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
