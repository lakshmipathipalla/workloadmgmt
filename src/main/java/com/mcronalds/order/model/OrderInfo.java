package com.mcronalds.order.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrderInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-03T10:15:13.729Z")

public class OrderInfo {
	@JsonProperty("header")
	private Header header = null;

	@JsonProperty("orderID")
	private String orderID = null;

	public OrderInfo header(Header header) {
		this.header = header;
		return this;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public OrderInfo orderID(String orderID) {
		this.orderID = orderID;
		return this;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OrderInfo orderInfo = (OrderInfo) o;
		return Objects.equals(this.header, orderInfo.header) && Objects.equals(this.orderID, orderInfo.orderID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(header, orderID);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OrderInfo {\n");

		sb.append("    header: ").append(toIndentedString(header)).append("\n");
		sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
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
