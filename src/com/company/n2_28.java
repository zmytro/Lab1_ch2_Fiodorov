package com.company;

import java.util.Scanner;
import java.lang.Math;

public class n2_28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;
        double area,diameter,circumference;
        System.out.print("Enter radius:");
        radius = input.nextInt();
        diameter = 2*radius;
        circumference = 2*Math.PI*radius;
        area = Math.PI*radius*radius;
        System.out.println("diameter= "+diameter);
        System.out.println("circumference= "+circumference);
        System.out.println("area= "+area);

    }
}