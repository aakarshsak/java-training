package com.example;

public class Truck implements IVehicle2{
	
	@Override
	public void start() {
		System.out.println("Truck Starting...");
	}
	
	@Override
	public void stop() {
		System.out.println("Truck Stopping...");
	
		
	}@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Truck Put Brakes...");
	}

}
