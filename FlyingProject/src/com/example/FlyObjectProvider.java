package com.example;

public class FlyObjectProvider {
	
	public static IFly getFlyingObject(String str) {
		if(str.equals(IFly.BIRD_TYPE)) {
			return new Bird();
		}
		else if(str.equals(IFly.SUPERMAN_TYPE)) {
			return new Superman();
		}
		else if(str.equals(IFly.AEROPLANE_TYPE)) {
			return new Aeroplane();
		}
		return null;
	}
	
}
