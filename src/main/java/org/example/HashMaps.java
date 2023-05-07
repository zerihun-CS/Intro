package org.example;

import java.util.HashMap;

public class HashMaps {


    public static void main(String[] args) {

        int[] array =  {21,21,21,43,3,4,4,5,6,7,8,9,10,3,4,4,3,3,4,6,6};
        HashMap<Integer, Integer> repeatedNumbers = new HashMap<>();
        int count = 0;
        for(int value:array){
           count =  (repeatedNumbers.containsKey(value)?repeatedNumbers.get(value):0);
           repeatedNumbers.put(value, ++count);
        }

        System.out.println(repeatedNumbers);


    }
}
