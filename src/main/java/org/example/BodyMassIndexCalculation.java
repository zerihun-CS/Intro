package org.example;

public class BodyMassIndexCalculation {

    public static void main(String[] args) {

        float weight = 90;
        float height = 45;

        System.out.println(bodyMassIndex(90,45));
    }

    static String bodyMassIndex(float height, float weight){

        float index = (float) (weight/Math.pow(height, 2));


        if(index <= 18.5)
            return "UnderWeight";
        else if (index <= 24.9)
            return "Normal";
        else if (index < 29.9)
            return "OverWeight";
        else if (index > 30)
            return "Obese";
        else
            return "no Weight";


    }

}
