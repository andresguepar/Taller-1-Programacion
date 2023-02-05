package com.java.ex14;

import java.util.Scanner;

public class PrinSchoolGrades {
        public static void main(String[] args) {
            SchoolGrades schoolGrades = new SchoolGrades();
            Scanner sc = new Scanner(System.in);
            System.out.println("Type your Physics grade");
            schoolGrades.physics = sc.nextDouble();
            System.out.println("Type your Chemistry grade");
            schoolGrades.chemistry = sc.nextDouble();
            System.out.println("Type your Biology grade");
            schoolGrades.biology=sc.nextDouble();
            System.out.println("Type your Maths grade");
            schoolGrades.maths = sc.nextDouble();
            System.out.println("Type your Computer Science grade");
            schoolGrades.computerScience = sc.nextDouble();
            System.out.println("Calculating average....");
            System.out.println("Your average is: "+ schoolGrades.finalGrade());
            System.out.println(schoolGrades.showMessage());


        }
}
