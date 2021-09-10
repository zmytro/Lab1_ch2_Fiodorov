package com.company;

import java.util.Scanner;
import java.lang.Math;

public class n2_30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int d1,d2,d3,d4,d5;
        System.out.print("Enter number:");
        number = input.nextInt();
        if((((number % 10000) % 1000 % 100)) % 10 == 5) {
            d1 = number / 10000;
            d2 = (number % 10000) / 1000;
            d3 = ((number % 10000) % 1000) / 100;
            d4 = (((number % 10000) % 1000 % 100)) / 10;
            d5 = (((number % 10000) % 1000 % 100)) % 10;
            System.out.print(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
        }else System.out.print("The humber is too short/long");
    }
}