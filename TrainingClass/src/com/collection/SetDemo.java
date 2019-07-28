package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.io.Student;

public class SetDemo {

	public static void main(String[] args) {
		
		
		Set<Student> names = new HashSet<>();
		names.add(new Student(101, "Aakarsh"));
		names.add(new Student(108, "Aman"));
		names.add(new Student(102, "Bhusha"));
		names.add(new Student(104, "Minsha"));
		
		for(Student s : names) {
			System.out.println(s);
		}
		
		
		names = new LinkedHashSet<>();
		names.add(new Student(101, "Aakarsh"));
		names.add(new Student(108, "Aman"));
		names.add(new Student(102, "Bhusha"));
		names.add(new Student(104, "Minsha"));
		
		for(Student s : names) {
			System.out.println(s);
		}
		
		
		
		names = new TreeSet<>(new StudentNameComparator());
		names.add(new Student(101, "Aakarsh"));
		names.add(new Student(108, "Aman"));
		names.add(new Student(102, "Bhusha"));
		names.add(new Student(104, "Minsha"));
		
		for(Student s : names) {
			System.out.println(s);
		}
	}

}
