package com.company;

import java.util.Scanner;

public class n2_15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum,prod,diff,div;
        System.out.println("Enter First Integer:");
        number1 = input.nextInt();
        System.out.println("Enter Second Integer:");
        number2 = input.nextInt();
        sum = number1 + number2;
        prod = number1 * number2;
        diff = number1 - number2;
        div  = number1 / number2;
        System.out.println("Sum between "+number1+" and "+number2+" = "+sum);
        System.out.println("Product between "+number1+" and "+number2+" = "+prod);
        System.out.println("Difference between "+number1+" and "+number2+" = "+diff);
        System.out.println("Division between "+number1+" and "+number2+" = "+div);


    }
}