package com.example;

import java.util.Calendar;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
	
	static String str = "title=Java: The Complete Reference;" + "author=Schildt;"
			+ "publisher=Osborne/McGraw-Hill;";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer t = new StringTokenizer(str, "=;");
		while(t.hasMoreTokens()) {
			String s = t.nextToken();
			System.out.println(s);
		}
		
		
		Calendar calendar = Calendar.getInstance();
		
	}

}
