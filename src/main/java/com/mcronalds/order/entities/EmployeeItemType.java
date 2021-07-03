package com.mcronalds.order.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee_item_type database table.
 * 
 */
@Entity
@Table(name="employee_item_type")
@NamedQuery(name="EmployeeItemType.findAll", query="SELECT e FROM EmployeeItemType e")
public class EmployeeItemType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="employee_id")
	private Integer employeeId;

	@Column(name="item_type")
	private Integer itemType;

	public EmployeeItemType() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getItemType() {
		return this.itemType;
	}

	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}

}