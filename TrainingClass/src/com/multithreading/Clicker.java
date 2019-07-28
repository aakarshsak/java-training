package com.multithreading;

public class Clicker implements Runnable{

	long counter ;
	Thread t;
	volatile Boolean running = true;
	
	public Clicker(String name, int priority) {
			
		t = new Thread(this, name);
		t.setPriority(priority);
		
	}
	
	
	
	@Override
	public void run() {
		while(running) {
			counter++;
		}
	}
	
	
	public void stop() {
		running  = false;
	}
	
	
	public void start() {
		t.start();
	}
}
