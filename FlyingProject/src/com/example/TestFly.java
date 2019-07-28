package com.example;

import java.util.Scanner;

public class TestFly {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.Bird\n2.Superman\n3.Aeroplane\nEnter : ");
		
		int c = sc.nextInt();
		
		IFly f;
		
		if(c == 1) {
			f = FlyObjectProvider.getFlyingObject(IFly.BIRD_TYPE);
		}
		else if( c == 2) {
			f = FlyObjectProvider.getFlyingObject(IFly.SUPERMAN_TYPE);
		}
		else {
			f = FlyObjectProvider.getFlyingObject(IFly.AEROPLANE_TYPE);
		}
		
		f.fly();
		
		sc.close();
	}
	
}
