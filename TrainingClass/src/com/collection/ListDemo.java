package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<>();
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Sauma");
		names.add("Bauaa");
		names.add("Ramesh");
		
		names.add(2, "Kusum");
		
		
		Iterator<String> i = names.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\n\n");
		
		for(String s: names) {
			System.out.println(s);
		}
		
	}

}
