package com.multithreading;

public class ThreadTest {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		
		
		for(int i=5;i>0;i--) {
			
			System.out.println("Inside main thread ....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		System.out.println("Main Exiting....");
		
	}

}
