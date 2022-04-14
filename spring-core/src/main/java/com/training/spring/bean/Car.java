package com.training.spring.bean;

public class Car {
	private String make;
	private String model;
	private int year;
	public Car() {
		this.make= make;
		this.model = model;
		this.year = year;
		
	}
	
	public void Car1() {
		// TODO Auto-generated constructor stub
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public  String getCarDetails() {
		return this.model+" "+this.make+" "+this.year;
	}
	

}
