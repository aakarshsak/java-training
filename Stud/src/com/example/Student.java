package com.example;

import java.io.File;
import java.io.Serializable;

import stud.exception.StudentException;

public class Student implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final static File FILE = new File("student.ser");
	private int roll;
	private String name;
	
	
	public Student(int roll, String name)throws StudentException {
		
		if(roll <= 0) {
			throw new StudentException("Roll is negative....");
		}
		if(name != null && name.equals("")) {
			throw new StudentException("Name is empty...");
		}
		this.roll = roll;
		this.name = name;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll)throws StudentException {
		if(roll <= 0) {
			throw new StudentException("Roll is negative....");
		}
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name)throws StudentException {
		if(name == null || name.equals("")) {
			throw new StudentException("Name is empty...");
		}
		this.name = name;
	}
	
	
	
}
