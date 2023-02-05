package com.java.ex11;

import java.util.Scanner;

public class PrinNum {
    public static void main(String[] args) {
        Num num =  new Num();
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        num.num = sc.nextInt();

        System.out.println("Number "+ num.num + " is " + num.verifyNum() );
    }
}
