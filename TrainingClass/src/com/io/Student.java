package com.io;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int roll;
	private String name;
	private String usn;
	
	public String getUsn() {
		return usn;
	}


	public void setUsn(String usn) {
		this.usn = usn;
	}


	public Student(int roll, String name){
		
		this.roll = roll;
		this.name = name;
		this.usn = usn;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.roll - o.getRoll();
	}
	
	
	
}
