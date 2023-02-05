package com.java.ex10;

public class Pay {
    public int hours;
    public int cash1;
    public int cash2;

    public int salary(){
        if (hours > 0 && hours < 10){
            return cash1;
        } else {
            return cash2;
        }
    }
}
