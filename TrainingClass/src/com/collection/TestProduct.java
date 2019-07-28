package com.collection;

import java.util.HashSet;
import java.util.Set;

public class TestProduct {

	public static void main(String[] args) {
		
		Set<Product> prods = new HashSet<>();
		prods.add(new Product(106, "Oppo Pone", 15000.22));
		prods.add(new Product(101, "Alto", 200000.22));
		prods.add(new Product(106, "Mars", 1222.222));
		prods.add(new Product(103, "Bhusha", 12000.22));
		prods.add(new Product(104, "pioe", 18000.22));
		prods.add(new Product(104, "pioe", 18000.22));
		
		
		for(Product p : prods) {
			System.out.println(p);
		}
	}

}
