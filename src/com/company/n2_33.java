package com.company;

import java.util.Scanner;

public class n2_33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double h,kg,bmi;
        System.out.print("Enter your height:");
        h = input.nextDouble();
        System.out.print("Enter your weight:");
        kg = input.nextDouble();
        bmi = kg/(h*h);
        System.out.println("BMI Values");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
        if(bmi<=18.5)
            System.out.printf("Your BMI index - %.2f - Underweight",bmi);
        if(bmi>=18.5&&bmi<=24.9)
            System.out.printf("Your BMI index - %.2f - Normal",bmi);
        if(bmi>=25&&bmi<=29.9)
            System.out.printf("Your BMI index - %.2f - Overweight",bmi);
        if(bmi>=30)
            System.out.printf("Your BMI index - %.2f - Obese",bmi);



    }
}