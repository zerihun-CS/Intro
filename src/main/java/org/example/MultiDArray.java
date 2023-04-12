package org.example;

import java.util.Arrays;

public class MultiDArray {
    public static void main(String[] args) {
        int[]numbersList = {4,3,2,23};
        int[][][]numbers = new int[4][2][4];


        // src , srcPosition, des,desPos, length
        System.arraycopy(numbersList,0,numbers[1][1],0,4);


        System.out.println(Arrays.deepToString(numbers));
    }
}
