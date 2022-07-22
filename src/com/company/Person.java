package com.company;

public class Person {
    String name;
    int age;
    int address;
    Person(){
        System.out.println(name + "" + age + address);
    }
    Person(String name, int age, int address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void display(){
        System.out.println(name + " " + age + " " + address);
    }
}
