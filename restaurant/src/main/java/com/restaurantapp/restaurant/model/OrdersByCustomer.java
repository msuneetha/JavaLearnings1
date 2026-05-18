package com.restaurantapp.restaurant.model;

public class OrdersByCustomer 
{
	private String itemName;
	private double price;
	
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "OrdersByCustomer [itemName=" + itemName + ", price=" + price + "]";
	}
	
}
