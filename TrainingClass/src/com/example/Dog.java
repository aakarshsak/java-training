package com.example;

public class Dog extends Animal implements IVehicle{

    public void talk(){

        System.out.println("BOEW WOEW!!");
    }
    public void wagTail() {
    	System.out.println("Wag Tail!!");
    }
    public void eat() {
    	System.out.println("Dog Eats!!");
    }
    
    @Override
    public void start() {
    	// TODO Auto-generated method stub
    	System.out.println("DOg starting...");
    }
    
    @Override
    public void stop() {
    	// TODO Auto-generated method stub
    	System.out.println("Dog stoping...");
    }
}