package com.mercury.daos;

public class CarDao {
	
	private String brand;
	private int size;
	
	public CarDao() {
	
	}
	
	public CarDao(String brand, int size) {
		super();
		this.brand = brand;
		this.size = size;
	}

	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "CarDao [brand=" + brand + ", size=" + size + "]";
	}
	
	

	
	
}
