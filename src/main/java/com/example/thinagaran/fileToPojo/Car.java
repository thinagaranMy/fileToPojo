package com.example.thinagaran.fileToPojo;

public class Car {
	private String brand;
	private String name;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", name=" + name + "]";
	} 
}
