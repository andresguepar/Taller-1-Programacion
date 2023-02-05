package com.java.ex10;

import java.util.Scanner;

public class PrinPay {
    public static void main(String[] args) {
        Pay pay = new Pay();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite numero de horas");
        pay.hours = sc.nextInt();

        pay.cash1 = pay.hours * 30000;
        pay.cash2 = pay.hours * 33000;
        System.out.println("Sr las horas " + pay.hours + " equivalen a su salario " + pay.salary());
    }
}
