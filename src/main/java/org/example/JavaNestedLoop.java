package org.example;

public class JavaNestedLoop {

    public static void main(String[] args) {
//
//        System.out.println("hello");
//        System.out.print("hello again");
//        System.out.println("  hi");

//        for (int i = 0; i < 5; i++) {
//            System.out.println("I = "+i);
//            for (int j = 0; j < 5 ; j++) {
//                System.out.print(j+" ");
//            }
//
//            System.out.println("new line");
//        }


        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }


        for (int i = 1; i < 6 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }





    }
}
