package com.multithreading;

public class MyThreadR implements Runnable{
	
	
	Thread t;
	
	public MyThreadR(String name) {
		t = new Thread(this, name);
		t.start();
	}
	
	
	@Override
	public void run() {
		
		System.out.println("Child Thread Run....");
		
		
		for(int i=5;i>0;i--) {
			System.out.println("Child    "  + i);
			
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Child Thread Exiting....");
		
	}
	
}
