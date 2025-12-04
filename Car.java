package com.bpi.exercises;

public class Car {
	
	private String brand;
	private int mileage;
	private String owner;
	
	public Car(String brand, int mileage, String owner) {
		this.setBrand(brand);
		this.setMileage(mileage);
		this.setOwner(owner);
	}
	
	public Car() {
			
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public int getMileage() {
		return this.mileage;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void startEngine() {
		System.out.println("Starting Engine");
	}
}
