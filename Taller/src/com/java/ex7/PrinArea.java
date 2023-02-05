package com.java.ex7;

public class PrinArea {

        public static void main (String args[]) {
            Area area = new Area();

            area.altura = 15.5;
            area.base = 20.2;

            System.out.println(area.validarDatos());

            System.out.println("The area of the rectangle is: " + area.calcularArea() + " cm");



        }
    }

