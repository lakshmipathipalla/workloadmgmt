package com.mcronalds.order.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrderDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-03T10:15:13.729Z")


public class OrderDetails   {
  @JsonProperty("header")
  private Header header = null;

  @JsonProperty("orders")
  private Header orders = null;

  public OrderDetails header(Header header) {
    this.header = header;
    return this;
  }



  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public OrderDetails orders(Header orders) {
    this.orders = orders;
    return this;
  }

  public Header getOrders() {
    return orders;
  }

  public void setOrders(Header orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetails orderDetails = (OrderDetails) o;
    return Objects.equals(this.header, orderDetails.header) &&
        Objects.equals(this.orders, orderDetails.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetails {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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

