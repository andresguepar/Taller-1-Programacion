package com.java.ex16;

import java.util.Scanner;

public class PrinReceipt {
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select  1.Female 2.Male");
        receipt.gender = sc.nextInt();
        System.out.println("Type your Age");
        receipt.age = sc.nextInt();
        System.out.println("Calculating...");
        System.out.println("Town Hall help you with: "+ receipt.confirmType());

    }
}
