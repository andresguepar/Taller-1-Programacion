package com.java.ex13;

import java.util.Scanner;

public class PrinPair {
    public static void main(String[] args) {
        Pair pair = new Pair();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero");
        pair.num = sc.nextInt();

        System.out.println(pair.verifyNum());
    }
}
