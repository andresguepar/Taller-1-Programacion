package com.java.ex12;

import java.util.Scanner;

public class PrinWash {
    public static void main(String[] args) {
        Wash wash = new Wash();

        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int option;

        while(!exit){
            System.out.println("Ingrese el numero de lavadoras");
            wash.numWash = sc.nextInt();
            System.out.println("Ingrese el numero de horas");
            wash.hours = sc.nextInt();

            wash.big = wash.numWash * wash.hours * 4000;
            wash.little = wash.numWash * wash.hours * 3000;

            System.out.println("1. Big");
            System.out.println("2. Litlle ");
            System.out.println("3. Exit");

            option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.println("Su total es: " + wash.big);
                    wash.percent = wash.big * -0.03 + wash.big;
                    System.out.println(wash.discount());
                    break;
                case 2:
                    System.out.println("Su total es: " + wash.little);
                    wash.percent = wash.little * -0.03 + wash.little;
                    System.out.println(wash.discount());
                    break;
                case 3:
                    exit=true;
                    break;
                default:
                     System.out.println("Not Found");
            }
        }
    }
}
