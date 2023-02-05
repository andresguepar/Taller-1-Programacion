package com.java.ex21;
import java.util.Scanner;
public class PrinAutos {

    public static void main(String[] args) {
            Autos autos = new Autos();
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite el número de modelo del automovil");
            autos.modelo = sc.nextInt();

            System.out.println(autos.avisoUsuario());
        }
    }

