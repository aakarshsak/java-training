package com.example;

public class TestVehicle {

	public static void main(String[] args) {
		
		IVehicle v = VehicleProvider.getVehicle(IVehicle2.HEAVY_TYPE);
		v.start();
		v.stop();
		
		if(v instanceof Truck) {
			((Truck)v).brake();
		}
		
		if(v instanceof Dog) {
			((Dog)v).talk();
		}
			
	}

}
