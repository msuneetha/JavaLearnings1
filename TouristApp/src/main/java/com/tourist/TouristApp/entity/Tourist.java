package com.tourist.TouristApp.entity;

import jakarta.persistence.Entity;

@Entity
public class Tourist 
{
	private int id;
	private String name;
	private String city;
	private Double budget;
	private String packageType;
	
	public Tourist(int id, String name, String city, Double budget, String packageType) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.budget = budget;
		this.packageType = packageType;
	}
	
	public Tourist() {
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	
	@Override
	public String toString() {
		return "Tourist [id=" + id + ", name=" + name + ", city=" + city + ", budget=" + budget + ", packageType="
				+ packageType + "]";
	}
	
}
