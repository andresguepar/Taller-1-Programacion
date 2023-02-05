package com.java.ex18;

public class Grades {

    public int num1;
    public int num2;
    public int num3;

    public int sum = num1 + num2 + num3;

    public String ver(){
        if (sum == 180){
            return "Es triagulo";
        }else{
            return "No es Angulo";
        }
    }
}
