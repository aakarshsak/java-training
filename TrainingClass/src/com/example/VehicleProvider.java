package com.example;

public class VehicleProvider {

	
	public static IVehicle getVehicle(String s) {
		if(s.equals(IVehicle.LUXURY_TYPE))
			return new Car();
		else if(s.equals(IVehicle.PASSENGER_TYPE))
			return new Bus();
		else if(s.equals(IVehicle.PET_TYPE))
			return new Dog();
		else if(s.equals(IVehicle2.HEAVY_TYPE))
			return new Truck();
		return null;
	}
	
}
