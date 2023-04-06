package org.example;

import java.awt.*;
import java.util.Scanner;


public class JavaInput {
    public static void main(String args[]){
        Scanner input  = new Scanner(System.in);
        String name;

        System.out.println("hello ");



        System.out.println("please insert your name");
        name = input.next();
        System.out.println("hello "+name);
        System.out.println("please insert your last name");

        String  lastName = input.next();

        System.out.println("please insert your age");

        int age = input.nextInt();
        System.out.println("please insert your salary");

        float salary = input.nextFloat();

        System.out.println("do you have a criminal record");

        boolean crRecord = input.nextBoolean();



        System.out.println("hello "+name+lastName+"your age is "+age+" your salary is "+salary);








    }
}
