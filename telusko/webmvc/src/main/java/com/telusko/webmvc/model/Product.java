package com.telusko.webmvc.model;


public class Product 
{
	private int id;
	private String name;
	private Double cost;
	
	
	
	
	public Product(int id, String name, Double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}




	public Product() {
		super();
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Double getCost() {
		return cost;
	}




	public void setCost(Double cost) {
		this.cost = cost;
	}




	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
	

}
