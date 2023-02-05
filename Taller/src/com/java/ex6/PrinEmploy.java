package com.java.ex6;

public class PrinEmploy {
    public static void main(String args[]) {
        Employ  employ = new Employ();

        employ.codEmpleado = 123456;
        employ.setSalarioBasico(1000);
        employ.horasExtra = 2;
        employ.setNumeroHoras(24);
        employ.setDescuentoPrestamo(5000);

        System.out.println("The value of overtime is: " + employ.calcularValorHE());
        System.out.println("The accrued value is: " + employ.calcularDevengado());
        System.out.println("The value of the deducted is: " + employ.calcularDeducido());
        System.out.println("The net of your payment is: " + employ.calcularNeto());
    }
}
