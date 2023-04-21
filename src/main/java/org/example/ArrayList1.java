package org.example;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArrayList1 {

    public static void main(String[] args) {


        String[] studentName = new String[10];

     //   String[] newStudent = new studentName[10];


//        Queue<String> studentList = new LinkedList<>(); //fifo
//
//        studentList.add("hanna");
//        studentList.add("abel");
//        studentList.add("hailu");
//        studentList.add("seni");
//        studentList.add("yakob");
//
//        System.out.println(studentList);
//
//
//        //[yakob->seni->hailu->abel-> hanna]
//
//        studentList.remove();
//        studentList.remove();
//        System.out.println(studentList);

        //LinkedList
        //Queue
        //Stack




     //   ArrayList<Integer> numbers =  new ArrayList<>();

        //[yakob->seni->hailu->abel-> hanna]
//

        Stack<String> students  = new Stack<>();
        students.add("hanna");
        students.add("abel");
        students.add("hailu");
        students.add("seni");
        students.add("yakob");

        System.out.println(students);

        students.pop();

        System.out.println(students);


    }
}
