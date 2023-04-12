package org.example;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        int[] numbersList = {4,5,46,5,6,5,7,68,7,8,79,89,87,9,78,34,89,2,1};

        int largestNumber = numbersList[0];
        int secondLargestNumber = numbersList[0];


        for (int i = 0; i < numbersList.length ; i++) {
            if(largestNumber < numbersList[i]) {
                secondLargestNumber = largestNumber;
                largestNumber = numbersList[i];

            } else if (secondLargestNumber < numbersList[i] &&
                    numbersList[i]< largestNumber) {

                secondLargestNumber =  numbersList[i];

            }

        }
        System.out.println(secondLargestNumber);





    }
}
