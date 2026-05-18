package com.restaurantapp.restaurant.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order 
{
	private Integer customerId;
	private Integer menuId;
	@Id
	@Column(name="orderid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Boolean isBillPaid;
	
	public Order() {
		super();
	}


	public Order(Integer customerId, Integer menuId, Boolean isBillPaid) {
		super();
		this.customerId = customerId;
		this.menuId = menuId;
		this.isBillPaid = isBillPaid;
	}


	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public Integer getMenuId() {
		return menuId;
	}


	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Boolean getIsBillPaid() {
		return isBillPaid;
	}


	public void setIsBillPaid(Boolean isBillPaid) {
		this.isBillPaid = isBillPaid;
	}


	@Override
	public String toString() {
		return "Order [customerId=" + customerId + ", menuId=" + menuId + ", orderId=" + id + ", isBillPaid="
				+ isBillPaid + "]";
	}
	
}
