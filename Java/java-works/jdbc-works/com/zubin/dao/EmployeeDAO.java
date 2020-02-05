package com.zubin.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zubin.beans.*;
import com.zubin.connection.GetConnection;
import com.zubin.interfaces.*;

public class EmployeeDAO implements IEmployeeDAO {
	
	//-1 - for iterator
	//0 - for Array
	//1 - for Positional Parameters


	@Override
	public boolean insertEmployee(Employee employee) {
		String sql ="insert into emp values(?,?,?,?,?)";
		//you will have access to all ps + rs and always
		// there will be 1 connection object because it is
		//static
		GetConnection gc = new GetConnection();	
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
			
			gc.ps.setInt(1, employee.getEmpid());
			gc.ps.setString(2, employee.getEmpname());
			gc.ps.setDouble(3, employee.getEmpsal());
			gc.ps.setString(4, employee.getEmpemail());
			gc.ps.setInt(5, employee.getDeptid());
			
			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteEmployee(int empid) {
		String sql ="delete from emp where empid = ?";
		//you will have access to all ps + rs and always
		// there will be 1 connection object because it is
		//static
		GetConnection gc = new GetConnection();	
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
			gc.ps.setInt(1, empid);
			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployeeSalary(int empid, double empsal) {
		
		String sql = "update emp set empsal + ? where empid = ?";
		
		GetConnection gc = new GetConnection();	
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
			gc.ps.setDouble(1, empsal);
			gc.ps.setInt(2, empid);
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee getemployee(int empid) {
		String sql =" select empname,empsal,empemail,deptid where empid =?";
				
		GetConnection gc = new GetConnection();
		
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
			
			gc.ps.setInt(1,empid);

			gc.rs1 = gc.ps.executeQuery();
			
			if(gc.rs1.next()) {
				Employee employee = new Employee();
				employee.setEmpid(empid);
				employee.setEmpname(gc.rs1.getString(1));
				employee.setEmpsal(gc.rs1.getDouble(2));
				employee.setEmpemail(gc.rs1.getString(3));
				employee.setDeptid(gc.rs1.getInt(4));
				return employee;
			}else {
				System.out.println("Sorry record not found...." + empid);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql =" select empid,empname,empsal,empemail,deptid from emp";
		List<Employee> list = new ArrayList<Employee>();
		GetConnection gc = new GetConnection();
		
		try {
		gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
		
		gc.rs1 = gc.ps.executeQuery();
		
		while(gc.rs1.next()) {
			Employee employee = new Employee();
			employee.setEmpid(gc.rs1.getInt(1));
			employee.setEmpname(gc.rs1.getString(2));
			employee.setEmpsal(gc.rs1.getDouble(3));
			employee.setEmpemail(gc.rs1.getString(4));
			employee.setDeptid(gc.rs1.getInt(5));
			
			list.add(employee);
		   }
			return list;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return null;
	}

}
