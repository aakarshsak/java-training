package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("student.ser"));
			Student s1 = new Student(101, "Sunil");
			os.writeObject(s1);
			os.close();
			System.out.println("Object written....");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
