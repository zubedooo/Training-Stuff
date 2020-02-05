package com.zubin.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
public class Employee {
	private int empid;
	private String empname;
	private double empsal;
	private String empemail;
	private int deptid;

}
