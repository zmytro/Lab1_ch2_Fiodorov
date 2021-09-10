package com.company;

import java.util.Scanner;

public class n2_25 {

    public static void main(String[] args) {
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);
        int number1;
        System.out.print("Enter integer: "); // prompt
        number1 = input.nextInt(); // read first number from user
        if(number1 % 2 == 0) {
            System.out.println(number1+" is even"); // prompt
        }else System.out.println(number1+" is odd"); // prompt


    }
}