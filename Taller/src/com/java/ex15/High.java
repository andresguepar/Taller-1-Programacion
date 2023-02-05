package com.java.ex15;

public class High {
    public int num1;
    public int num2;
    public int num3;

    public String max() {
        if (num1 > num2 & num1 > num3) {
            return "Number 1";
        } else if (num2 > num1 & num2 > num3) {
            return "Number 2";
        } else if (num3 > num1 & num3 > num2) {
            return "Number 3";
        } else if (num1 == num2 & num1 > num3) {
            return "Number 1 & 2 are the highers";
        } else if (num1 > num2 & num1 == num3) {
            return "Number 1 & 3 are the highers";
        } else if (num2 == num3 & num2 > num1) {
            return "Number 2 & 3 are the highers";
        } else {
            return null;
        }

    }
}