package org.example;

public class JavaMethods {

    public static void main(String[] args) {
        // java internal method
        // user defined methods

        greet("hanna");

       // addition(5,6);

        System.out.println(addition(10,5)*3);


        System.out.println();
                  // arguments
    }


    static void greet(String name){
        System.out.println("hello "+name);
    }

    static float addition(int num, int num2){
                            //parameters


        float sum = num+num2;


       return sum;
    }

}
