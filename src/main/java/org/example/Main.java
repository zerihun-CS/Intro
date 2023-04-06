package org.example;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int age = 16;
//       boolean isAdult =  age > 18;
//       boolean isEthiopian  = true;
//       boolean hasCriminalRecord = true;
//
//        System.out.println((isAdult && isEthiopian)|| hasCriminalRecord );

//
//        boolean CompletedFinalProject = false;
//        boolean CompleteGrade = true;
//        boolean hasConductIssues = true;
//
//        System.out.println(!hasConductIssues);
//
//        System.out.println((CompleteGrade  && CompletedFinalProject)  || hasConductIssues);
//
//
//
//        float savingAmount  = 90_000;
//        float creditScore  = 9;
//
//        boolean hasEnoughSaving = 500_000 < savingAmount;
//        boolean goodCreditScore = 7< creditScore;
//        boolean hasCriminalRecord  = false;
//        boolean phoneFullyCharged = false;



//
//        System.out.println(!hasCriminalRecord &&
//                (hasEnoughSaving || goodCreditScore || phoneFullyCharged ));
//int x=10;
//System.out.println(x++);//10 (11)
//System.out.println(++x);//12
//System.out.println(x--);//12 (11)
//System.out.println(--x);//10
//
//        int x = 8;
//        int y = x++;
//
//        int z = y--;
//        int a  = ++z;
//        System.out.println(a);


//        System.out.println("please insert your salary ? ");
//
//       float salary = (int)(scanner.nextFloat());

        System.out.println((float) (Math.random()* 10));




        System.out.println("please insert the saving duration ?");
       int savingDurationInMonth = scanner.nextInt();;

        System.out.println("please insert the saving Amount ?");
        float savingAmount = scanner.nextFloat();
        System.out.println("please insert the loan Amount?");
       float loanAmount = scanner.nextFloat();


       boolean hasEnoughSaving  = 0.25*(loanAmount) <= savingAmount;

        System.out.println((0.25*(loanAmount) <= savingAmount)?"መበደር ይችላል":"ብድሩን መስጠጥ አንችልም");

        float weight  = 89;
//




       boolean hasEnoughSalary =  100 >= 70_000;

        System.out.println("do you have criminal record ?");
        String criminalRecordInput = scanner.next();


       boolean hasCriminalRecord = (criminalRecordInput.equalsIgnoreCase("yes"))?true:false;
       boolean consecutiveSavingDuration =  savingDurationInMonth >= 6;


        System.out.println(!hasCriminalRecord && consecutiveSavingDuration && (hasEnoughSaving || hasEnoughSalary));










    }
}