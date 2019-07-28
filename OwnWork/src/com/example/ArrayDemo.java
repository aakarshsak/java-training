package com.example;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		
		int s[] = new int[]{10, 20, 30, 40, 50};
		for(int x: s) {
			System.out.println(x);
		}
		System.out.println("\n\n");
		int d[] = new int[5];
		for(int x: d) {
			System.out.println(x);
		}
		System.out.println("\n\n");
		System.arraycopy(s, 0, d, 0, 5);
		for(int x: d) {
			System.out.println(x);
		}
		
		if(d.equals(s)) {
			System.out.println("Array is same");
		}
		else {
			System.out.println("Array not same");
		}
		
		
		
		
		int[][] twoDArray = new int[10][];
		for(int i=0;i<10;i++) {
			twoDArray[i] = new int[]{10, 20, 30, 50};
		}
		for(int[] x : twoDArray) {
			for(int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		
		StaticVarFunc s1 = new StaticVarFunc();
		s1.func();
		System.out.println(s1.getf());
	
		
		char data[] = new char[] {'a', 'b', 'c'};
		String str = new String(data);
		System.out.println(str);
		str = str + "def";
		System.out.println(str + "\n\n\n");
		
		
		String ss1 = new String("Hello");
		String ss2 = new String("Hello");
		
		System.out.println(ss1.equals(ss2));
		
		
		
		
		
		
		
	}
	
	
	
	

}