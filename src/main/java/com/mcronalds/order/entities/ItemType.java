package com.mcronalds.order.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ItemType" database table.
 * 
 */
@Entity
@Table(name="\"ItemType\"")
@NamedQuery(name="ItemType.findAll", query="SELECT i FROM ItemType i")
public class ItemType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"Id\"")
	private Integer id;

	private String description;

	private String type;

	public ItemType() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}