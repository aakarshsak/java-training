package com.example;

public class Employee {
	private int empId;
	private String name;
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
		System.out.println("Employee Cons" + this.empId + this.name);
	}
	
}
