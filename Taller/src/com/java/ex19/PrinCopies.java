package com.java.ex19;

import com.java.ex2.MedicApp;

import java.util.Scanner;

public class PrinCopies {
    public static void main(String[] args) {
        Copies copies = new Copies();

        Scanner sc = new Scanner(System.in);

        System.out.println("Type your copies");
        copies.numCop = sc.nextInt();

        copies.price1 = copies.numCop * 120;
        copies.price2 = copies.numCop * 100;
        copies.price3 = copies.numCop * 80;
        copies.price4 = copies.numCop * 50;

        System.out.println("Price is: $" + copies.price());

    }
}
