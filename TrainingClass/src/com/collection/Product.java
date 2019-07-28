package com.collection;

public class Product {

	
	private int pid;
	private String name;
	private double price;
	
	
	public Product(int pid, String name, double price){
		
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("Hash code " + this.pid );
		return this.pid;
	}
	
	@Override
	public boolean equals(Object obj) {
		Product other = (Product)obj;
		
		System.out.println("ID : " + this.pid  + "  OTHER ID : " + other.getPid());
		return this.pid == other.getPid();
	}

	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
