package com.mcronalds.order.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Employee" database table.
 * 
 */
@Entity
@Table(name="\"Employee\"")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"Id\"")
	private Integer id;

	@Column(name="\"Name\"")
	private String name;

	@Column(name="phone_number")
	private Integer phoneNumber;

	public Employee() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}