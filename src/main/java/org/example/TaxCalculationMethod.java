package org.example;

import java.util.Scanner;

public class TaxCalculationMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please insert your salary amount");
        float grossSalary = scanner.nextFloat();

        netSalary(grossSalary);


    }

    static float incomeTax(float grSalary){
        float incomeTax = 0;

        if (grSalary > 60_000) {
            incomeTax = (float) (grSalary * 0.3);


        } else if (grSalary > 30_000) {
            incomeTax = (float) (grSalary * 0.15);

        } else if (grSalary > 5_000) {
            incomeTax = (float) (grSalary * 0.10);

        } else if (grSalary < 5_000) {
            incomeTax = 0;

        }
        return incomeTax;
    }

    static float pensionTax(float groSalary){
        float pension = 0;
        if (groSalary > 60_000) {

            pension = (float) (groSalary * 0.07);

        } else if (groSalary > 30_000) {

            pension = (float) (groSalary * 0.05);
        } else if (groSalary > 5_000) {

            pension = (float) (groSalary * 0.03);
        } else if (groSalary < 5_000) {

            pension = 0;
        }
        return pension;
    }

    static void netSalary(float salary){

      float netSalary =  salary -  (incomeTax(salary) + pensionTax(salary));


        System.out.println("income tax " + incomeTax(salary));
        System.out.println("pension " + pensionTax(salary));
        System.out.println("net salary " + netSalary);

    }

}
