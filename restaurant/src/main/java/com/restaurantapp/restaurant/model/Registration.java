package com.restaurantapp.restaurant.model;

public class Registration 
{
	private String name;
	private long phoneNumber;
	private String email;
	private String address;
	private String password;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Registration [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address="
				+ address + ", password=" + password + "]";
	}
	
}
