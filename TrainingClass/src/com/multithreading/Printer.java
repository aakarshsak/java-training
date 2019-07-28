package com.multithreading;

public class Printer {

	
	public synchronized void print(String msg) {
		System.out.print("[" + msg);
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			System.out.print("]");
	}
}
