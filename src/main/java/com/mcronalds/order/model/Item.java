package com.mcronalds.order.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Item
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-03T10:15:13.729Z")


public class Item   {
  @JsonProperty("itemName")
  private String itemName = null;

  @JsonProperty("itemDescription")
  private String itemDescription = null;

  @JsonProperty("toppings")
  private Toppings toppings = null;

  public Item itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }


  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public Item itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }



  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public Item toppings(Toppings toppings) {
    this.toppings = toppings;
    return this;
  }

 

  public Toppings getToppings() {
    return toppings;
  }

  public void setToppings(Toppings toppings) {
    this.toppings = toppings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.itemName, item.itemName) &&
        Objects.equals(this.itemDescription, item.itemDescription) &&
        Objects.equals(this.toppings, item.toppings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemName, itemDescription, toppings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    toppings: ").append(toIndentedString(toppings)).append("\n");
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

