package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2 {

	public static void main(String[] args) {
		try {
			ObjectInputStream os = new  ObjectInputStream(new FileInputStream("student.ser"));
			Student s = (Student)os.readObject();
			os.close();
			System.out.println(s.getName() + "      " + s.getRoll());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
