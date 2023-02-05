package com.java.ex7;

public class Area {

        public double altura;
        public double base;


        public String validarDatos(){

            return "The base is: " + base + "cm" + " and the high is: " + altura + "cm";
        }

        public double calcularArea() {

            return base * altura;
        }

    }

