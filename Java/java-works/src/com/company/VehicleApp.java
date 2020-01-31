package com.company;

public class VehicleApp {
	public static void main(String[] args) {
		Car C = new Car(4,35,0,3);
		
		C.move();
		C.stop();
		C.seatCapacity();
		
		C.accelerate();
		C.accelerate();
		
		C.fuelCapacity();
		
		System.out.println("Number of doors in car "+C.getDoors());
		
		C.setGear(1);
		System.out.println("Car running @ "+C.getGear()+" gear");
		
		Jeep J = new Jeep(7,40,true);
		
		J.accelerate();
		J.accelerate();
		
		J.fuelCapacity();
		
		J.move();
		J.stop();
		J.seatCapacity();
		
		J.canGoOffRoad();
	}

}
