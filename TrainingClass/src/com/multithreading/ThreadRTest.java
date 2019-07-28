package com.multithreading;

public class ThreadRTest {

	public static void main(String[] args) {
		
		
		System.out.println("MAin Classs");
		
		MyThreadR t = new MyThreadR("Awesome Thread");
		
		for(int i=5;i>0;i--) {
			
			System.out.println("main Thread "  +i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		try {
			t.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
