package com.example;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String s = "this   is     a   new string.    ";
		
		System.out.println(s);
		
		Boolean ss = s.startsWith("This");
		
		System.out.println(ss);
		
		ss = s.endsWith("String.");
		
		System.out.println(ss);
		
		String s1 = "This is a new String.";
		
		System.out.println("Compare : " + s1.compareTo(s));
		
		System.out.println(s1.indexOf("is", 6));
		
		System.out.println(s1.substring(3, 7));
		
		String new_s1 = s1.concat(" Something!!!");
		
		System.out.println(new_s1);
		
		String new_s12 = s1.replace('s', '5');
		System.out.println(new_s12);
		
		
		//char[] data = {'a', 'b', 'c'};
		
		System.out.println(String.valueOf(true));
		
		System.out.println(s1);
		
		
		String str = "laost index of.";
		System.out.println(str.lastIndexOf("o", 6));
		
		String mod_str = "Hello World";
		mod_str = mod_str + 123;
		System.out.println(mod_str);
		
		
		byte c[] = {2, 4};
		String n = new String(c);
		
		
		System.out.println(n);
		
		

	}

}
