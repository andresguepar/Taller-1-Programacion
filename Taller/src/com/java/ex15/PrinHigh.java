package com.java.ex15;

import java.util.Scanner;

public class PrinHigh {
    public static void main(String[] args) {
        High high = new High();
        Scanner sc = new Scanner(System.in);
        System.out.println("Type number 1");
        high.num1 = sc.nextInt();
        System.out.println("Type number 2");
        high.num2 = sc.nextInt();
        System.out.println("Type number 3");
        high.num3 = sc.nextInt();
        System.out.println("Calculating the higher number");
        System.out.println(high.max());


    }
}
