package com.company;

public class Jeep extends FourWheeler {
	private boolean offRoad;

	public Jeep(int noOfSeats, int fuelCapacity,boolean offRoad) {
		super(noOfSeats, fuelCapacity);
		this.offRoad=offRoad;
	}
	public void canGoOffRoad() {
		System.out.println(offRoad?" It can go off road": "Sorry it cannot go off road");
	}
	@Override
	public void move() {
		System.out.println("Jeep is moving... ");
	}
	@Override
	public void stop() {
		System.out.println("Jeep is stopping... ");
	}

}
