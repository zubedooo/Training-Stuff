package com.company;

public abstract class FourWheeler extends Vehicle {
	
	private int speed;
	private int fuelCapacity;

	public FourWheeler(int noOfSeats, int fuelCapacity) {
		
		
	}
	
	public void accelerate() {
		System.out.println("This Vehicle is moving at " + speed++);
	}
	public void fuelCapacity() {
		System.out.println("Fuel capacity is "+ fuelCapacity);
	}

}
