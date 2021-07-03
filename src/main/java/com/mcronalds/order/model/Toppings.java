package com.mcronalds.order.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Toppings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-03T10:15:13.729Z")


public class Toppings   {
  @JsonProperty("toppingName")
  private String toppingName = null;

  @JsonProperty("toppingDescription")
  private String toppingDescription = null;

  public Toppings toppingName(String toppingName) {
    this.toppingName = toppingName;
    return this;
  }




  public String getToppingName() {
    return toppingName;
  }

  public void setToppingName(String toppingName) {
    this.toppingName = toppingName;
  }

  public Toppings toppingDescription(String toppingDescription) {
    this.toppingDescription = toppingDescription;
    return this;
  }




  public String getToppingDescription() {
    return toppingDescription;
  }

  public void setToppingDescription(String toppingDescription) {
    this.toppingDescription = toppingDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Toppings toppings = (Toppings) o;
    return Objects.equals(this.toppingName, toppings.toppingName) &&
        Objects.equals(this.toppingDescription, toppings.toppingDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toppingName, toppingDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Toppings {\n");
    
    sb.append("    toppingName: ").append(toIndentedString(toppingName)).append("\n");
    sb.append("    toppingDescription: ").append(toIndentedString(toppingDescription)).append("\n");
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

