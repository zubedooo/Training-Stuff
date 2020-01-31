package com.company;

//if a class has a default constructor
//private variables
//public getters and setters
//then the class is called Java Bean

public class Customer {

		//properties
		private int customerId;
		private String customerName;
		private double customerIncome;
		
		//this will be injected by compiler at compile time
		public Customer() {
			super();
		}

		
	void display() {
		
		System.out.println("Customer ID: "+ customerId);
		System.out.println("Customer Name: "+ customerName);
		System.out.println("Customer Income: "+ customerIncome);
	}
	
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	public void setCustomerName(String customerName) {
		if(customerName.length() < 5)
		{
			System.out.println("Sorry name too short");
			this.customerName="No name";
		}
		else {
		this.customerName=customerName;
		}
	}
	public void setCustomerIncome(double customerIncome) {
		if(customerIncome < 5000) 
		{
			System.out.println("Sorry, invalid income.");
			this.customerIncome=5000;
		}
		else {
		this.customerIncome=customerIncome;
		}
	}
	public int getCustomerId() {
		return this.customerId;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	public double getCustomerIncome() {
		return this.customerIncome;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
