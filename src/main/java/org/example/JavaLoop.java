package org.example;

import java.util.Random;
import java.util.Scanner;

public class JavaLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // for(intial exp ; condtion; update exp){

        //code
        //}
        int number;
        for(number=1; number <=10; number++ ){

            System.out.println(number);

        }



        //user input number
        // we generate a random number
        //  if ran == input-> congra
        // else -> try again



        for (int i = 0; i < 10; i--) {

            System.out.println("please insert a number ");
            int userInput =  scanner.nextInt();
            Random random = new Random();
            int randomNumber  = random.nextInt(0,5);
            //System.out.println("the random generated value is"+randomNumber);
            if(randomNumber==userInput) {
                System.out.println("congrats you have won");
                break;
            }

            else
                System.out.println("please try again");

        }



    }
}
