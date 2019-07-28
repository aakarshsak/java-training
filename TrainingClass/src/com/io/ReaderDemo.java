package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) {
		
		
		Student[] s = new Student[100];
		int i=0;
		try(FileReader f = new FileReader("students.csv");BufferedReader br = new BufferedReader(f)){
			String line = br.readLine();
			while(line != null && line.trim().length() != 0) {
				System.out.println(line);
				String[] a = line.split(",");
				line = br.readLine();
				s[i++] = new Student(Integer.parseInt(a[0]), a[1]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			
		}
		
		
		for(int j=0;j<i;j++) {
			System.out.println(s[i].getRoll() + ", " + s[i].getName());
		}

	}

}
