package com.company;

import java.util.Scanner;

public class n2_16 {

    public static void main(String[] args) {
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);

        int number1; // first number to compare
        int number2; // second number to compare

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user

        if (number1 == number2)
            System.out.println("These numbers are equal");
        if (number1 > number2)
            System.out.println(number1+" is larger");
        if (number1 < number2)
            System.out.println(number2+" is larger");


    }
}