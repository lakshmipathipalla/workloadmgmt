package com.mcronalds.order.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the toppings database table.
 * 
 */
@Entity
@Table(name="toppings")
@NamedQuery(name="Topping.findAll", query="SELECT t FROM Topping t")
public class Topping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="topping_id")
	private Integer toppingId;

	private double price;

	@Column(name="topping_desc")
	private String toppingDesc;

	public Topping() {
	}

	public Integer getToppingId() {
		return this.toppingId;
	}

	public void setToppingId(Integer toppingId) {
		this.toppingId = toppingId;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getToppingDesc() {
		return this.toppingDesc;
	}

	public void setToppingDesc(String toppingDesc) {
		this.toppingDesc = toppingDesc;
	}

}