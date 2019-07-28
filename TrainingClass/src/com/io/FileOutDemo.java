package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.example.IVehicle;

public class FileOutDemo {

	
	public static void main(String[] args) {
		
		
		byte[] data = null;
		
		try(FileInputStream file = new FileInputStream("/home/zoro/Documents/file")) {
			
			int size = file.available();
			
			data = new byte[size];
			
			file.read(data);
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		//String m = "Hellow Aakarsh!!!;";
		
		//byte[] data = m.getBytes();
		
		try(FileOutputStream file = new FileOutputStream("new_file.txt")) {
			file.write(data);
			System.out.println("file written.....");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
