package com.java.ex12;

public class Wash {
    public int big;
    public int little;
    public int hours;
    public int numWash;
    public double percent;

    public String discount() {
        if (numWash > 3) {
            return "Su total con descuento es: " + percent;
        }else {
            return "No tiene descuento";
        }
    }
}
