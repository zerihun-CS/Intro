package org.example;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] numbersList = {454,6,546,5,6,76,8,78,7980,980,9};

        int[] lastNumber = new int[4];
        System.out.println(Arrays.toString(lastNumber));
        // src , srcPosition, des,desPos, length
        System.arraycopy(numbersList,7,lastNumber,0,4);

        System.out.println(Arrays.toString(lastNumber));
    }
}
