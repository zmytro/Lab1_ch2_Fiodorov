package com.company;

import java.util.Scanner;

public class n2_24 {

    public static void main(String[] args) {
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);
        int number1,number2,number3,number4,number5; // first number to compare
        int sum,avg,prod,min = -2147483648,max = 2147483647;
        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user

        System.out.print("Enter third integer: "); // prompt
        number3 = input.nextInt(); // read second number from user

        System.out.print("Enter fourth integer: "); // prompt
        number4 = input.nextInt(); // read second number from user

        System.out.print("Enter fifth integer: "); // prompt
        number5 = input.nextInt(); // read second number from user

        if(number1>number2 && number1 > number3 && number1 > number4 && number1 > number5) max = number1;
        if(number2>number1 && number2 > number3 && number2 > number4 && number2 > number5) max = number2;
        if(number3>number1 && number3 > number2 && number3 > number4 && number3 > number5) max = number3;
        if(number4>number1 && number4 > number2 && number4 > number3 && number4 > number5) max = number4;
        if(number5>number1 && number5 > number2 && number5 > number3 && number5 > number4) max = number5;

        if(number1<number2 && number1 < number3 && number1 < number4 && number1 < number5) min = number1;
        if(number2<number1 && number2 < number3 && number2 < number4 && number2 < number5) min = number2;
        if(number3<number1 && number3 < number2 && number3 < number4 && number3 < number5) min = number3;
        if(number4>number1 && number4 < number2 && number4 < number3 && number4 < number5) min = number4;
        if(number5>number1 && number5 < number2 && number5 < number3 && number5 < number4) min = number5;

        System.out.println("min = "+min); // prompt
        System.out.println("max = "+max); // prompt



    }
}