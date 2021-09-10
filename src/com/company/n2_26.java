package com.company;

import java.util.Scanner;

public class n2_26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int result;
        System.out.print("Enter First Number:");
        number1 = input.nextInt();
        System.out.print("Enter Second Number:");
        number2 = input.nextInt();
        result = number2%number1;
        if(result == 0) System.out.printf("%d is a multiple of %d", number1,number2);
        else System.out.printf("%d isn't a multiple of %d", number1,number2);



    }
}