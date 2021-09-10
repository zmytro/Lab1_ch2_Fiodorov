package com.company;

import java.util.Scanner;

public class n2_17 {

    public static void main(String[] args) {
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);
        int number1; // first number to compare
        int number2; // second number to compare
        int number3; // third number to compare
        int sum,avg,prod,min = 0,max = 0;
        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user

        System.out.print("Enter third integer: "); // prompt
        number3 = input.nextInt(); // read second number from user

        sum = number1 + number2 + number3;
        avg = sum/3;
        prod = number1*number2*number3;
        System.out.println("Sum = "+sum); // prompt
        System.out.println("Avg = "+avg); // prompt
        System.out.println("Product = "+prod); // prompt
        if(number1>number2 && number1 > number3) max = number1;
        if(number2>number1 && number2 > number3) max = number2;
        if(number3>number1 && number3 > number2) max = number3;

        if(number1<number2 && number1 < number3) min = number1;
        if(number2<number1 && number2 < number3) min = number2;
        if(number3<number1 && number3 < number2) min = number3;

        System.out.println("min = "+min); // prompt
        System.out.println("max = "+max); // prompt



    }
}