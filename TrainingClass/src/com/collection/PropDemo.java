package com.collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropDemo {

	public static void main(String[] args) {
		
		
		Properties prop = new Properties();
		
		prop.put("Musha", "Mosha");
		prop.put("Tusha", "tosha");
		prop.put("Gusha", "Gosha");
		
		
		System.out.println(prop.getProperty("Musha"));
		System.out.println(prop.getProperty("Tuhsa", "Not Found"));
		System.out.println(prop.getProperty("Gusha"));
		
		try {
			prop.store(new FileOutputStream("capitals.properties"), "State Capitals");
			System.out.println("Stored Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
