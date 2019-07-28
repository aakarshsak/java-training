package com.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("emp.dat"));
			
			dos.writeInt(101);
			dos.writeFloat(1.11f);
			dos.writeUTF("Aak");
			dos.close();
			System.out.println("Data written...");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
