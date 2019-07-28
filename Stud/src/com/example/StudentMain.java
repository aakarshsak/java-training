package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import stud.exception.StudentException;

public class StudentMain {
	
	static int currentSize;
	
	public static Student[] shiftLeft(Student[] a, int pos, int len) {
		
		for(int i = pos; i<len-1; i++) {
			a[i] = a[i+1];
		}
		
		return a;
	}
	
	
	public static void setObjectFile(Student[] studArray, int i) {
		
		currentSize = i;
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(Student.FILE))) {	
			os.writeInt(currentSize);
			os.writeObject(studArray);		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Student[] getObjectFile() {
		
		Student[] studArray = null;
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Student.FILE))) {
			currentSize = ois.readInt();
			studArray = (Student[])ois.readObject();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return studArray;
		
	}

	public static void main(String[] args) {
				
		Student[] studArray;
		
		studArray = getObjectFile();
		
		int  i = 0;
		
		if(studArray == null) {
			studArray = new Student[25];
		}
		else {
			i = currentSize;
		}
		
		//System.out.println("i :: "   + i);
		
		Scanner sc = new Scanner(System.in);
		
		Boolean b = false;	
		
		while(true) {
			
			System.out.print("\n\n1.Add Student.\n"
					+ "2.Search Student By Name.\n"
					+ "3.Search Student By Roll.\n"
					+ "4.List Students.\n"
					+ "5.Delete Student By Roll.\n"
					+ "6.Exit.\n"
					+ "Enter ur choice : ");
			int choice = sc.nextInt();
			
			switch( choice ) {
			
				case 1 : {
					System.out.print("\n\nEnter the name : ");
					String name = sc.next();
					System.out.print("Enter the roll : ");
					int roll = sc.nextInt();
					try {
						studArray[i++] = new Student(roll, name);	
					} catch (StudentException e) {
						System.out.println(e.getDetails());
					}
					break;
				}
				case 2: {
					int flag = 0;
					System.out.print("\n\nEnter the name to Search : ");
					String name = sc.next();
					for( int j=0;j<i;j++) {
						if(name.equals(studArray[j].getName())) {
							flag = j+1;
							break;
						}
					}
					if(flag == 0) {
						System.out.println(name + " is not found.\n\n");
					}
					else {
						System.out.println("Name : " + name + " Roll : "+ studArray[flag-1].getRoll() +" is found at pos " + flag + "\n\n");
					}
					break;
				}
				case 3: {
					int flag = 0;
					System.out.print("\n\nEnter the roll to Search : ");
					int roll = sc.nextInt();
					for( int j=0;j<i;j++) {
						if(roll == studArray[j].getRoll()) {
							flag = j+1;
							break;
						}
					}
					if(flag == 0) {
						System.out.println(roll + " is not found. \n\n");
					}
					else {
						System.out.println("Roll : " + roll + " Name : "+ studArray[flag-1].getName() +" is found at pos " + flag + "\n\n");
					}
					break;
				}
				case 4: {
					System.out.println("\n\nROLL\t\t\tNAME\n");
					
					try {
						for(int j=0;j<i;j++) {
							System.out.println(studArray[j].getRoll() + "\t\t\t" + studArray[j].getName());
						}
					} catch (NullPointerException e) {
						System.out.println("\nThats all.....");
					}
					break;
				}
				
				case 5: {
					
					System.out.print("Enter roll to delete : ");
					int roll = sc.nextInt();
					int j;
					for(j = 0;j<i;j++) {
						if( roll == studArray[j].getRoll()) {
							System.out.println("Name : " + studArray[j].getName() + "\nRoll : " + roll + "\nDeleted.....");
							studArray = shiftLeft(studArray, j, i);
							break;
						}
					}
					if(j == i) {
						System.out.println("No Student to delete....");
					}
					i = i-1;
				}
				case 6: {
					b = true;
					break;
				}
						
			}
			if(b) {
				break;
			}
			setObjectFile(studArray, i);
		}
		 	
		setObjectFile(studArray, i);
		
		sc.close();

	}

}
