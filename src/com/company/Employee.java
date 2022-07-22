package com.company;

public class Employee {
    int id;
    String name;
    String department;
    int age;
    String gender;
    Employee(){

    }
    Employee(int id, String name, String department, int age, String gender){
        this.age = age;
        this.id = id;
        this.department = department;
        this.gender = gender;
        this.name = name;
    }
    void display(){
        System.out.println(id + " "+ name + " "+ department + " "+ age + " " + gender);
    }
}
