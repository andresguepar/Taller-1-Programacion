package com.java.ex13;

public class Pair {
    public int num;

    public String verifyNum(){
        if (num%2 == 0){
            return "Es Par";
        }else {
            return "Es Impar";
        }
    }
}
