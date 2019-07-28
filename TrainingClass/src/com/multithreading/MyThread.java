package com.multithreading;

public class MyThread extends Thread{

	MyThread(){
		start();
	}
	
	
	@Override
	public void run() {
		
		
		System.out.println("Entering child thread run");
		
		
		
		for(int i=5;i>0;i--) {
			
			System.out.println("Child " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Child thread exiting...");
		
	}

}
