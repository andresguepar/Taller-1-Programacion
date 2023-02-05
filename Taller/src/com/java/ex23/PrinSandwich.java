package com.java.ex23;
import java.util.Scanner;
public class PrinSandwich {

    public static void main(String[] args) {
            Sandwich sandwich = new Sandwich();
            Scanner sc = new Scanner(System.in);

            System.out.println("¿Qué tamaño de sandwich desea?");
            sandwich.tamaño = sc.next();
            System.out.println("¿Desea añadir pavo?");
            sandwich.pavo = sc.next();
            System.out.println("¿Desea añadir Tocineta");
            sandwich.tocineta = sc.next();
            System.out.println("¿Desea queso?");
            sandwich.queso = sc.next();

            sandwich.prep();

            System.out.println(sandwich.orderPrice());
        }
    }

