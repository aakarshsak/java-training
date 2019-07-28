package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try(FileInputStream file = new FileInputStream("/home/zoro/Documents/file")) {
			
			int size = file.available();
			
			System.out.println(size);
			
			byte[] data = new byte[size];
			
			file.read(data);
			
			System.out.println(new String(data));
			
			//IT is  a wrong approach because the looop runs for a long time
			for(int i=0; i<size;i++) {
				System.out.print((char)file.read());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
