package com.multithreading;

public class TestClicker {

	public static void main(String[] args) {
		
		
		
		Clicker low = new Clicker("LOW", Thread.NORM_PRIORITY - 1);
		Clicker high = new Clicker("HIGH", Thread.NORM_PRIORITY + 2);

		
		low.start();
		high.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		high.stop();
		low.stop();
		
		System.out.println("HIGH COUNTER : " + high.counter);
		System.out.println("LOW COUNTER : " + low.counter);
	}

}
