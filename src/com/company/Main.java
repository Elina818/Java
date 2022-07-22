package com.company;
import com.sun.javafx.geom.BaseBounds;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        /*
        System.out.println("Please enter your age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("You are eligibel to vote");
        }else{
            System.out.println("malyavka");
        }
        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();
        if(num % 2 ==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }


         */
        Person p2 = new Person("Elina",18, 48);
        Person p3 = new Person("Manchulik", 18, 48);
        p2.display();
        p3.display();

        //2nd problem
        Employee kutul = new Employee(123456, "Elina", "IT", 18, "female");
        Employee manchul = new Employee(123456, "manchul", "IT", 18, "female");
        Employee chaxo = new Employee(123456, "Suzy", "IT", 24, "female");
        Employee chax = new Employee(123456, "Shavarsh", "taxi", 56, "male");
        Employee malish = new Employee(123456, "Lusine", "Finance", 46, "female");
        kutul.display();
        chaxo.display();
        manchul.display();
        malish.display();
        chax.display();
        //3rd xndir
        Author syu = new Author("Syu", "syu1292@gmail", "female");
        syu.print();
        syu.getEmail();
        syu.getName();
        syu.getGender();
        Book kto = new Book("aot", "kto", 30000);
        kto.setPrice(20000);
        kto.print();
        /*
        Random random = new Random();
        int n1 = random.nextInt(2) +5;
        System.out.println(n1);

         */


        /*
        System.out.println("write 3 numbers");
        Scanner s2 = new Scanner(System.in);
        int number1= s2.nextInt();
        int number2 = s2.nextInt();
        int number3 = s2.nextInt();
        if(number1 > number2 && number1>number3){
            System.out.println(number1);
        }else if(number2>number1 && number2>number3){
            System.out.println(number2);
        }else{
            System.out.println(number3);
        }

         */

        /*
    Scanner ki = new Scanner(System.in);
        int input = ki.nextInt();
        switch(input){
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("SaturdAay");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

         */

        /*
        Scanner year = new Scanner(System.in);
        int y = year.nextInt();
        if(y%4==0){
            if(y%100 ==0){
                if(y%400 ==0){
                    System.out.println("Leap year");
                }else{
                    System.out.println("Not a leap year");
                }
            }else{
                System.out.println("Not a leap year");
            }
        }else{
            System.out.println("Not a leap year");
        }

         */

        /*
        Random gen = new Random();
        float in = gen.nextInt();
        boolean answer = true;

        if(in>-1000 && in <1000){
            System.out.println(answer);
        }else if(in%3 ==0 || in % 5==0){
            answer = true;
            System.out.println(answer);
        }else{
            answer = false;
            System.out.println(answer);;
        }

         */

        /*
        System.out.println("Input a");
        Scanner n1 = new Scanner(System.in);
        int a = n1.nextInt();
        System.out.println("Input b");
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();
        if(a>10 && b!=10){
            System.out.println("Both a and b legal");
        }else if(a>0 && b>0){
            System.out.println("Both a and b legal");
        }else if(a<0 && b<0){
            System.out.println("Both a and b legal");
        }else if(a>10 && b<1 && a%2==1 && b%2==1){
            System.out.println("Both a and b legal");
        }else if(a%5==0 || b%5==0){
            System.out.println("Both a and b legal");
        }else if(a%5!=0 && b%5==0){
            System.out.println("Both a and b legal");
        }else{
            System.out.println("Both a and b illegal");
        }

         */

        System.out.println("Input a:");
        Scanner n1 = new Scanner(System.in);
        int a = n1.nextInt();
        System.out.println("Input b:");
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();
        if(a>0 && b>0 && a%7==0 || b%7==0 && a>b){
            for(int i=b; i<=a;i++){
                if(i%2==1){
                    System.out.println(i);
                }
            }
        }else{
            for(int i=a; i<=b; i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
            System.out.println("not even");
        }
    }

}
