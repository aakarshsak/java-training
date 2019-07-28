package com.example;

public class AnimalProvider {

    public static Animal getAnimal(String n){

        if(n == "FAITHFUL"){
            return new Dog();
        }
        if( n == "CUTE"){
            return new Cat();
        }
        return null;

    }

}


///Add Student
///Search Student by roll no.
///Search student by name
///List Students
///exit