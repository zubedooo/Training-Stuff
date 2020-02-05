package com.zubin.interfaces;

import java.util.List;

import com.zubin.beans.Employee;

//contract
public interface IEmployeeDAO {
	public boolean insertEmployee(Employee employee);
	public boolean deleteEmployee(int empid);
	public boolean updateEmployeeSalary(int empid, double empsal);
	public Employee getemployee(int empid);
	public List<Employee> getAllEmployees();
}
