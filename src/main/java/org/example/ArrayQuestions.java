package org.example;

public class ArrayQuestions {
    public static void main(String[] args) {
        String sentence = "hello   how are you i am good you ear?";
        int repeatedTimes=0;
        char repeatedValue=' ';
        int count;
        for (char letter : sentence.toCharArray()){
                count = 0;
            for (char letter2 : sentence.toCharArray()){
                if(letter == letter2 && letter != ' ')
                    count +=1;
            }
            if(repeatedTimes < count ){
                repeatedValue = letter;
                repeatedTimes = count;

            }

        }


        System.out.println(repeatedValue);

    }
}
