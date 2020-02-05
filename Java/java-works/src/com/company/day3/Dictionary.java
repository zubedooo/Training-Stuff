package com.company.day3;

import java.io.*;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Dictionary {
	public static void main(String[] args) {
		HashMap<String,String> dictionary = new HashMap <String,String>(10);
		
		dictionary.put("good morning"," : Good morning, Bonjour");
		dictionary.put("good evening", " : Good evening, Bonsoir" );
		dictionary.put("smart"," : clever, brainy, intelligent, genius");
		
		Scanner in = new Scanner(System.in);
		String input = "q";
		
		do {
			System.out.println("\n Enter the word you should to look up.\n Press q to quit");
		
			input = in.nextLine();
			//input = input.toLowerCase(); 
			//input = input.replace(" ",""); 
			if ( dictionary.containsKey(input) ) {
				String definition = dictionary.get(input);
				System.out.println("input: \n" + definition);
			}
			else {
				System.out.println("Word not found");
			}
	}while (! input.equalsIgnoreCase("q") );
	}
}