package org.example;

public class MethodRecursion {

    public static void main(String[] args) {
        System.out.println(summation(2));



    }

    static int add(int number){
        number = number+1;
        if(number < 4)
            return  add(number);
        else
            return number;
    }

    static int summation(int number){

        if(number> 0)
            return number+  summation(number-1);

        else
            return number;



    }

}
