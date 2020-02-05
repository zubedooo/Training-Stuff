package com.zubin.app;

import com.zubin.beans.Employee;
import com.zubin.dao.EmployeeDAO;
import com.zubin.interfaces.IEmployeeDAO;

public class EmployeeApp {
	public static void main(String[] args) {
		IEmployeeDAO dao = new EmployeeDAO();
		
		/*Employee employee = new Employee (101,"Saahil", 4500, "saahil@ps.com",10);
		Employee employee1 = new Employee (102,"Zubin", 5000, "zub@ps.com",20);
		Employee employee2 = new Employee (103,"Mayank", 4500, "may@ps.com",20);
		Employee employee3 = new Employee (104,"Sanjana", 3500, "sanj@ps.com",10);
		Employee employee4 = new Employee (105,"Preeti", 4000, "preeti@ps.com",30);
		
		System.out.println(dao.insertEmployee(employee) ? "Inserted":"Sorry, Not Inserted");
		System.out.println(dao.insertEmployee(employee1) ? "Inserted":"Sorry, Not Inserted");
		System.out.println(dao.insertEmployee(employee2) ? "Inserted":"Sorry, Not Inserted");
		System.out.println(dao.insertEmployee(employee3)? "Inserted":"Sorry, Not Inserted");
		System.out.println(dao.insertEmployee(employee4) ? "Inserted":"Sorry, Not Inserted");*/
		//System.out.println(dao.deleteEmployee(101) ? "deleted":"Sorry, Not Deleted");
		for(Employee temp : dao.getAllEmployees()) {
			System.out.println(temp);
		}
	}

}
