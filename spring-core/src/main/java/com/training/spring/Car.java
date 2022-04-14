package com.training.spring;

public class Car {
	
	private String make;
	private static String model;
	private int year;
	public Car(String model,String make,int year) {
	this.model = model;
	this.make = make;
	this.year=year;
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
	
	public String getCarDetails() {
		// TODO Auto-generated method stub
		return model;
	}

	}


