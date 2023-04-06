package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeIfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char grade = 'F';
        System.out.println("please insert your result ?");

        int mark  = scanner.nextInt();

        System.out.println("number of class  attended");

        int numberClassAttended   = scanner.nextInt();

        if(mark > 90 && mark < 100)
            grade  = 'A';
        else if (mark > 80 && mark < 90)
            grade  = 'B';
        else if (mark > 70 && mark < 80 )
            grade  = 'C';
        else if (mark < 70)
            grade  = 'D';


        System.out.println(grade);

        if(grade =='A') {
            if (numberClassAttended > 5)
                System.out.println("pass ");
            else
                System.out.println("fail");

        }
        if(grade =='B'){

            if (numberClassAttended > 7)
                System.out.println("pass ");
            else
                System.out.println("fail");

        }

    }
}
