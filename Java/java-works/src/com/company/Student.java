package com.company;

public class Student implements Comparable<Student> {
	private int sId;
	private String sName;
	private double sPercentage;
	private int sMarks;

	public Student(int sId, String sName, double sPercentage) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sPercentage = sPercentage;
	}
	public int getsMarks() {
		return sMarks;
	}
	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public double getsPercentage() {
		return sPercentage;
	}
	public void setsPercentage(double sPercentage) {
		this.sPercentage = sPercentage;
	}
	@Override
	public int compareTo(Student o) {
		//return o.siD - this.sId;
		
		return this.sName.compareTo(o.getsName());
		
	}

}
