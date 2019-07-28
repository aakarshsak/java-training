package com.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DataInputStream d = new DataInputStream(new FileInputStream("emp.dat"));
			System.out.println(d.readInt());
			System.out.println(d.readFloat());
			System.out.println(d.readUTF());
			d.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
