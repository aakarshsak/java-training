package com.example;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c = new Calculator();
		
		int res = 0;
		
		try{
			res = c.divide(10,  0);
		}catch(RuntimeException e) {
			System.out.println(e);
		}finally {
			System.out.println("Finallly isn main.....");
		}
		
		System.out.println(res);
	}

}
