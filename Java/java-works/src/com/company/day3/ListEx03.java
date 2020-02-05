package com.company.day3;

import java.util.Vector;

//vector
public class ListEx03 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(7 , 6);
		
	
		System.out.println("initial vector : "+ vector);
		System.out.println("initial size : "+ vector.size());
		//capacity method is defined only in vector class
		//not in collection/List interface (Vector implements List)
		System.out.println("initial capacity : "+ vector.capacity());
		
		vector.add("One");
		vector.add("Two");
		vector.add("Three");
		vector.add("Four");
		vector.add("Five");
		
		vector.add("One");
		vector.add("Two");
		vector.add("Three");
		vector.add("Four");
		vector.add("Five");
		
		vector.add("Six");
		
		System.out.println("After inserting vector : "+ vector);
		System.out.println("After inserting size : "+ vector.size());
		System.out.println("After inserting capacity : "+ vector.capacity());
	}
}
