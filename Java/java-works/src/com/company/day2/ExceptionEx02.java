package com.company.day2;

//by extending the class from Exception class,
//you give an opportunity to throw that class
@SuppressWarnings("serial")
class NameShortException extends Exception{
	
	private String message;
	
	public NameShortException() {
		this.message="Sorry name is too short";
	}
	
	public NameShortException(String message) {
		this.message=message;
	}
	
	@Override
	public String toString() {
		return "NameShortException [message="+ message + "]";
	}
	
}
@SuppressWarnings("serial")
class MinimalSalaryException extends Exception{
	
	private String message;
	
	public MinimalSalaryException() {
		this.message="Sorry not minimal";
	}
	
	public MinimalSalaryException(String message) {
		this.message=message;
	}
	
	@Override
	public String toString() {
		return "MinimalSalaryException [message="+ message + "]";
	}
	
}

public class ExceptionEx02 {
	public static void processIncomeTax(String name, int salary) throws MinimalSalaryException,NameShortException {
		if(name.length() < 5) {
			throw new NameShortException("Sorry name is too short");
		}else if(salary < 10000) {
			throw new RuntimeException("Sorry Invalid Salary " + name);
		}else if(salary >=10000 && salary <20000) {
			throw new MinimalSalaryException("Sorry minimum salary given of "+ salary +" for Mr/Ms/Mrs:" + name);
		}else {
			System.out.println("Thank you, your IT returns are being filed Mr/Ms/Mrs: "+ name);
		}
	}
	
	public static void main(String[] args) throws MinimalSalaryException,NameShortException {
		try {
		processIncomeTax("Sanj", 20000);
		}catch(MinimalSalaryException mse) {
			System.out.println(mse); //
		}
		
		System.out.println("Some other business logic...");
		
	}

}
