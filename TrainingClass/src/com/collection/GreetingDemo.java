package com.collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GreetingDemo {

	
	public static void main(String[] args) {
		
		Properties p = new Properties();
		try {
			p.load(new FileInputStream("college.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Welcome to " + p.getProperty("COLLEGE_NAME"));
		System.out.println("Welcomed by professor " + p.getProperty("PRINCIPAL"));
	}
}
