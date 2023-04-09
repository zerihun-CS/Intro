package org.example;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float incomeTax = 0;
        float netSalary =0;
        float pension =0;
        float salary =0;
        // tax calculation
        // 60_000 < salary 30%  and 7 % pension
        // 30_000 < salary 15%  and 5 % pension
        // 5_000 < salary 10%  and 3 % pension
        // 5_000 > salary 0%  and 0 % pension

        while (true) {
            System.out.println("do you want to calculate your tax's");
            String userInput = scanner.next();

            if(userInput.equalsIgnoreCase("no"))
                break;


            System.out.println("please insert your salary ");
            salary = scanner.nextFloat();
            if (salary > 60_000) {
                incomeTax = (float) (salary * 0.3);
                pension = (float) (salary * 0.07);

            } else if (salary > 30_000) {
                incomeTax = (float) (salary * 0.15);
                pension = (float) (salary * 0.05);
            } else if (salary > 5_000) {
                incomeTax = (float) (salary * 0.10);
                pension = (float) (salary * 0.03);
            } else if (salary < 5_000) {
                incomeTax = 0;
                pension = 0;
            }
            System.out.println("income tax " + incomeTax);
            System.out.println("pension " + pension);
            System.out.println("net salary " + (salary - (incomeTax + pension)));

        }



    }
}
