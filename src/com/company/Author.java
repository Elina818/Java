package com.company;

public class Author {
    String name;
    String email;
    String gender;
    Author(String email){ }
    Author(String name, String email, String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    void print(){
        System.out.println(name + " "+ email + " "+ gender);
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getGender(){
        return gender;
    }
    public void setName(String n){
         name = n;
    }
    public void setEmail(String em){
        email = em;
    }
    public void setGender(String g){
        gender = g;
    }
}
