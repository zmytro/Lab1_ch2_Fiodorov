package com.company;

import java.util.Scanner;

public class n2_32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, number4, number5;

        int count_pos = 0,count_neg = 0,count_neutral = 0; //счетчики

        System.out.print("Enter first number:");
        number1 = input.nextInt();

        System.out.print("Enter second number:");
        number2 = input.nextInt();

        System.out.print("Enter third number:");
        number3 = input.nextInt();

        System.out.print("Enter fourth number:");
        number4 = input.nextInt();

        System.out.print("Enter fifth number:");
        number5 = input.nextInt();

        if(number1 > 0) count_pos = count_pos+1;
        if(number1 < 0) count_neg = count_neg+1;
        if(number1 == 0) count_neutral = count_neutral+1;

        if(number2 > 0) count_pos = count_pos+1;
        if(number2 < 0) count_neg = count_neg+1;
        if(number2 == 0) count_neutral = count_neutral+1;

        if(number3 > 0) count_pos = count_pos+1;
        if(number3 < 0) count_neg = count_neg+1;
        if(number3 == 0) count_neutral = count_neutral+1;

        if(number4 > 0) count_pos = count_pos+1;
        if(number4 < 0) count_neg = count_neg+1;
        if(number4 == 0) count_neutral = count_neutral+1;

        if(number5 > 0) count_pos = count_pos+1;
        if(number5 < 0) count_neg = count_neg+1;
        if(number5 == 0) count_neutral = count_neutral+1;

        System.out.println("Count of positive numbers: "+ count_pos);
        System.out.println("Count of negative numbers: "+ count_neg);
        System.out.println("Count of zero numbers: " + count_neutral);
    }
}