package com.company.day2;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Monitor");
		list.add("Computer");
		list.add("Bottle");
		list.add("Presenter");
		
		for(String temp : list) {
			System.out.println(temp);
		}
		//internally
		
		Iterator<String>itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//sublist
		for(String obj : list.subList(0,2)){
			System.out.println(obj);
		}
		//check if the element is present
		//clear
	}

}
