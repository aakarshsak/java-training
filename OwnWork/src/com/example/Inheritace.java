package com.example;

import java.util.Comparator;

class A {
	
	private int a, b;
	
	public A(int m, int n) { 
		a = m;
		b = n;
	}
	
	public void display() {
		System.out.println("A and B "  + a + "\t" + b);
	}
	
}
class B extends A implements Cloneable {
	
	private int c;
	public B(int m, int n, int o) { 
		super(m, n);
		c = o;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public void display() {
		System.out.println("C "  + c);
	}
	
}

public class Inheritace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(1, 3 ,5);
		b.display();
		Boolean bool = false;
		Object o = null;
		try {
			o = b.clone();
			bool = o instanceof B; 
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		System.out.println(o);
		
		Object c = o.getClass();
		System.out.println(c);
		int hash = c.hashCode();
		System.out.println(c);
	}

}
