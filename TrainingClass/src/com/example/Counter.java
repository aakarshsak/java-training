package com.example;

public class Counter {
	
	public static int objectCount;
	
	public Counter() {
		objectCount++;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method entered "+objectCount);
		objectCount++;
		System.out.println("Finalize method exit " +objectCount);
	}
}
