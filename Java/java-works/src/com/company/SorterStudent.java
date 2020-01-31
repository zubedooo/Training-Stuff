package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class SorterStudent {
	public static Student[] ascStudentName(Student [] students) {
		Comparable sorter = new Comparator<Student>() {
			
			Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
			return o2.getsName().compareTo(o1.getsName());
			}
			
		});
		return students;
	}
	public static Student[] descStudentName(Student [] students) {
		Arrays.sort(students,(o1,o2))}
	}
	public static Student[] ascStudentId(Student [] students) {}
	public static Student[] descStudentId(Student [] students) {}

}
