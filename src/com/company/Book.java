package com.company;

public class Book {
    String author;
    int price;
    String name;
    Book(String name, String author, int price){
        this.name = name;
        this.price = price;
        this.author = author;
    }
    void print(){
        System.out.println(name + " "+ author + " "+ price);
    }
   // void two(){
     //   System.out.println(name + " " + email);
    //}
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }
    void setAuthor(String authi){
        author = authi;
    }
    void setName(String n){
        name = n;
    }
    void setPrice(int p){
        price = p;
    }

}
