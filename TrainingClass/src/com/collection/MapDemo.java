package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, "Aaka");
		map.put(102, "Kishore");
		map.put(103, "Sumit");
		
		map.put(102, "Anil");
		
		Set<Entry<Integer, String>> mapEntry = map.entrySet();
		for(Entry<Integer, String> e : mapEntry) {
			System.out.println(e.getKey() + "      " + e.getValue());
		}
		
		
		for(int k : map.keySet()) {
			System.out.println(k);
		}

		
		for(String s : map.values()) {
			System.out.println(s);
		}
	}

}
