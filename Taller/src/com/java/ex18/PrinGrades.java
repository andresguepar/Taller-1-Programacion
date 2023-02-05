package com.java.ex18;

import java.util.Scanner;

public class PrinGrades {
    public static void main(String[] args) {
        Grades grades = new Grades();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca numero");

        grades.num1 = sc.nextInt();
        grades.num2 = sc.nextInt();
        grades.num3 = sc.nextInt();

        grades.sum = grades.num1 + grades.num2 + grades.num3;

        System.out.println(grades.sum);

        System.out.println("Es triangulo? " + grades.ver());

    }
}
