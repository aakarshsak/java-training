package com.example;

public class AnimalTest {

    public static void main(String[] args){

        Animal a = AnimalProvider.getAnimal("FAITHFUL");
        a.talk();
        
        if( a instanceof Dog) {
        	((Dog)a).wagTail();
        }
    }
}