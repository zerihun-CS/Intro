package org.example;
import com.sun.source.tree.BinaryTree;

import java.time.Year;
import java.util.LinkedList;
import java.util.Scanner;

public class ControlFlowStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please insert date of birth");
        int dateOfBirth = scanner.nextInt();
        int age  = (Year.now().getValue())- dateOfBirth;

        System.out.println((age > 18)?"adult":"under age");
        if(age < 18){
            System.out.println("under age ");
        } else if (age > 18  && age < 50) {
            System.out.println("You're an Adult");
        } else {
            System.out.println("old");
        }

        // is div 3  fizz
        // is dIv 5 buzz
        //both fizz buzz
        //non return the number


        int number  = 15;

         if (number %3 ==0 && number %5 ==0) {
            System.out.println("fizz buzz");
        }

        else if(number %  3==0){
            System.out.println("FIZZ");

        } else if (number % 5  ==0  ) {
            System.out.println("buzz");

            if(number > 25){
                if(number % 2==0)
                    System.out.println("even");
                else
                    System.out.println("odd");
            } else if (number < 25) {
                System.out.println(number);
            }
         }
        else {
            System.out.println(number);
        }




    }
}

