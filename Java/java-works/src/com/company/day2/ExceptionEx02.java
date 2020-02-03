package com.company.day2;

public class ExceptionEx02 {
	public static void processIncomeTax(String name, int salary) {
		if(salary < 10000) {
			//wrong case
		}else if(salary >=10000 && salary <20000) {
			//minimal wages
		}else {
			System.out.println("Thank you, your IT returns are being filed Mr/Ms/Mrs: "+ name);
		}
	}
	public static void main(String[] args) {
		processIncomeTax("Sanjana", 20000);
		
	}

}
