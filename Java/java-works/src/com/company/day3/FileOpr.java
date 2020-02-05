package com.company.day3;

import java.io.*;

public class FileOpr {
	public static void main(String[] args) throws IOException {
		
		File file = new File("hello.txt");
		
		if(file.exists()) {
			System.out.println("File Exists");
			
			System.out.println("Modified : "+ file.lastModified());
			System.out.println("Can read : "+ file.canRead());
			System.out.println("Can Write : "+ file.canWrite());
			System.out.println("Is File : "+ file.isFile());
			System.out.println("Absolute Path : "+ file.getAbsolutePath());
		}
		else {
			System.out.println("File does not exist so creating..... ");
			file.createNewFile();
		}
	}
}
