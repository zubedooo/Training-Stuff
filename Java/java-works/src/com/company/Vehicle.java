package com.company;

public abstract class Vehicle {
	private int noOfSeats;
	
	public Vehicle(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public Vehicle() {
		this.noOfSeats=1;
	}
	
	//access specifier access modifier return method_name(params)
	public abstract void move();
	
	public abstract void stop();
	
	public void seatCapacity() {
		System.out.println("No of seats is "+noOfSeats);
	}

}
