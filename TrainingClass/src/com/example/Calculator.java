package com.example;

public class Calculator {
	
	public int divide(int x, int y) {
		
		System.out.println("Before Calculation....");
		
		int res = 0 ;
		
		int[] a = new int[3];
		
		Bus b = null;
		
		try {
			b.start();
			a[3] = 5;
			res = x/y;
			System.out.println("After result....");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(a);
		}finally {
			System.out.println("Finnalyyy is  ruuuuunnnnnning.....");
		}
		
		return res;
		
	}
	
}
