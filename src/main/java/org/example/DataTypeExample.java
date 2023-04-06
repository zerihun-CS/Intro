package org.example;
import java.awt.*;

public class DataTypeExample {

    public static void main(String args[]){
//
//
       Point coordinate = new Point(2,6);
//
//
//
//
//
//
//        coordinate.x = 17;
//        coordinate.y = 21;
//
//        System.out.println(coordinate);
//
//
//        Point secondCoordinate = coordinate;
//        System.out.println(secondCoordinate);
//
//
//        coordinate.x = 7;
//        coordinate.y = 1;
//
//        String name  = "hanna kebede";
//
//        System.out.println(4!=7);

//        int age = 8;
//
//        int num2 = 10;
//        num2/=2;
//        System.out.println(num2-=10);


        //variable x = (expression) ? value if true : value if false
        int age = 8;
        float height = 1.7F;
        float weight  = 70;

        String ageStatus = (age > 18)?"Adult":"under Age";

        String BMI =  ((weight/(height*height))
                < 30)?"normal":"over weight";

        
        //bmi > 30 = over weight
        // bmi < 30  = normal



        System.out.println(ageStatus);




    }
}
