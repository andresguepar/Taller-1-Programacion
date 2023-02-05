package com.java.ex22;
import java.util.Scanner;

public class PrinPhone {

        public static void main(String[] args) {
            Phone phone = new Phone();
            Scanner sc = new Scanner(System.in);

            System.out.println("Escriba su operador");
            phone.setOperador(sc.next());

            System.out.println("Escriba los minutos totales consumidos");
            phone.setMinutosConsumidos(sc.nextInt());

            phone.operadorPrecios();

            System.out.println("El precio de su plan es de:" + phone.precioTotal());
        }
    }


