package com.example;

public class Director extends Manager{

	public Director(int empId, String name) {
		super(empId, name);
		System.out.println("Director Constructor");
	}

}
