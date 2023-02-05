package com.java.ex17;

public class Gym {
    public int type;
    public int day15 = 18000;
    public int day30 = 35000;
    public int month3 = 86000;
    public String howMuch(){
        if(type == 1){
            return "Pay 18000 for 15 days";
        }else if(type == 2){
            return "Pay 35000 for 30 days";
        }else if(type == 3){
            return "Pay 86000 for 3 months";
        }else{
            return "Error";
        }
    }

}
