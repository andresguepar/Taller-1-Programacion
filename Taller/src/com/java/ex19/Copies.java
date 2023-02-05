package com.java.ex19;

public class Copies {
    public int numCop;
    public int price1 ;
    public int price2 ;
    public  int price3 ;
    public int price4 ;

    public int price() {
        if (numCop < 499) {
            return price1 ;
        } else if (numCop > 500 && numCop < 749) {
            return price2 ;

        } else if (numCop > 750 && numCop < 999) {
             return price3;

        } else{
            return price4 ;

        }

    }

}
