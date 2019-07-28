package com.example;

public class MultiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSalary(new Employee(101, "Aakarsh"));
		printSalary(new Manager(102, "Something"));
		printSalary(new Director(101, "Sinha"));
	}
	
	public static void printSalary(Object obj) {
		if(obj instanceof Director) {
			System.out.println("Salary 1lakh");
		}
		else if(obj instanceof Manager) {
			System.out.println("Salary 50k");
		}
		else if(obj instanceof Employee) {
			System.out.println("Salary 10k");
		}
	}
}
