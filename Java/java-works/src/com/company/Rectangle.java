package com.company;

public class Rectangle implements Shape {
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	private int length;
	private int breadth;

	@Override
	public void area() {
		System.out.println("Area of Rect is: "+(length * breadth));
	}

}
