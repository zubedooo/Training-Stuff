package com.company;

public class CustomerApp {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		
		
		customer.setCustomerId(101);
		customer.setCustomerIncome(5000);
		customer.setCustomerName("Zub");
		
		show(customer);
		
		customer.display();

	}

	private static void show(Customer customer) {
		System.out.println("Cust ID "+ customer.getCustomerId());
		System.out.println("Cust Income "+ customer.getCustomerIncome());
		System.out.println("Cust Name "+ customer.getCustomerName());
	}

}
