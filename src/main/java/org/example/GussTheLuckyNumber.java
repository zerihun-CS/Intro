package org.example;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Random;
import java.util.Scanner;

public class GussTheLuckyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("please insert a number 1-10");
//        int randomNumber = (byte)(Math.random()*10);
//        System.out.println("the random number is "+randomNumber);
//        int userInput = scanner.nextInt();
//
//        //(expression)?"id true":"if false"
//        String output = (randomNumber==userInput)?"congrats":"please try again";
//
//        System.out.println(output);

        Random random  =new Random();
        System.out.println(random.nextInt(4, 21));



        System.out.println();

    }

}
