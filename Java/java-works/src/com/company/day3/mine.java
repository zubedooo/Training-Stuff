package com.company.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class mine {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = null;
		
		int empID;
		String empName;
		double empSal;
		
			System.out.println("Enter EmpID: ");
			empID=Integer.parseInt(br.readLine());
			
			System.out.println("Enter EmpName: ");
			empName=br.readLine();
			
			System.out.println("Enter EmpSal");
			empSal=Double.parseDouble(br.readLine());
			
			System.out.println("--------------------------------------------");
			System.out.println("EmpID is: "+empID);
			System.out.println("EmpName is: "+empName);
			System.out.println("EmpSal is: "+empSal);
			
			
			File file = new File("emp.txt");
			bw = new BufferedWriter(new FileWriter(file));
			
			bw.write("EmpID: "+empID);
			bw.write(" \nEmpName: "+empName);
			bw.write(" \nEmpSal: "+empSal);
			
			System.out.println("Data Saved.");
			bw.close();
		}

	}

