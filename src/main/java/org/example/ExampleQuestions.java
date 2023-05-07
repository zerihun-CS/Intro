package org.example;

import java.util.Arrays;

public class ExampleQuestions {
    public static void main(String[] args) {


    int[] array =  {21,21,21,43,3,4,4,5,6,7,8,9,10,3,4,4,3,3,4,6,6};
        //System.out.println( leastRepeated(array));
        System.out.println(reverse("hello my name is hanna" ));
        System.out.println(reverse(array));
    }

    /////////////////////////////////////////////////////////////
                    //method overloading Example
    static String reverse(String stringValue){
        char[] array = stringValue.toCharArray();
        String word = "";
    for (int i = array.length-1; i >= 0; i--) word+=array[i];
    return word;
    }

    static String reverse(int[] intValue){
       int[] newArray = new int[intValue.length];
       int count = 0;
        for (int i = intValue.length-1; i >= 0; i--) {
            newArray[count] = intValue[i];
            count++;
        }
        return (Arrays.toString(newArray));

    }

    ///////////////////////////////////////////////////////////////////

    static int mostRepeatedNew(int array[]){

        int count  = 0;
        int repeatedNumber = 0;
        int maxCount = 0;
        for(int value: array){
            count=0;
            for (int number:array){
                if(value == number) {
                    count += 1;
                }
            }
            if(maxCount < count){
                maxCount = count;
                repeatedNumber = value;
            }
        }
        System.out.println(repeatedNumber+" "+maxCount);


        return 0;
    }
    static int leastRepeated(int array[]){

        int count  = 0;
        int repeatedNumber = 0;
        int minCount = array[0];


        for(int value: array){
            count=0;
            // counting the repeated number
            for (int number:array){
                if(value == number) {
                    count += 1;
                }
            }
            // finding the min repeated number
            if(minCount >= count){
                minCount = count;
                repeatedNumber = value;

            }
        }
        System.out.println(repeatedNumber+" "+minCount);


        return 0;
    }
    static int mostRepeated(int array[]){

        int count  = 0;
        int repeatedNumber = 0;
        int maxCount = 0;
        for(int value: array){
            count=0;
            for (int number:array){
                if(value == number) {
                    count += 1;
                }
            }
            if(maxCount < count){
                maxCount = count;
                repeatedNumber = value;
            }
        }
        System.out.println(repeatedNumber+" "+maxCount);


        return 0;
    }
    static void maxSum(int[] array){

        int max = array[0];
        int secondMax = array[0];


        for(int number: array){

            if(max < number){
                secondMax = max;
                max = number;
            } else if (secondMax < number) {
                secondMax = number;

            }


        }


    }
    static int isComplete(int array[]){
        // 1 even number
        // min != max
        // numbers b/n min and max are in the array
    int min = array[0];
    int max = array[0];
    int Number0fEvenNumber = 0;
    boolean  status = false;
    for(int number: array){
        if(number %2==0) Number0fEvenNumber+=1;
        if(number > max) max = number;

        if(number < min) min  =  number;
    }
    if(min == max) return 0;
    if(Number0fEvenNumber ==0) return 0;
    for (int i = min+1; i < max; i++) {
        status = false;
        for (int single: array)
            if(i == single) status = true;
        if(status == false) return 0;
    }

    System.out.println(min+" "+ max);


        return 1 ;
}

}

