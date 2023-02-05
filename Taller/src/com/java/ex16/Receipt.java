package com.java.ex16;

public class Receipt {
    public int gender;
    public int age;
    public int type1 = 120000;
    public int type2 = 100000;
    public int type3 = 40000;

    public int confirmType(){
        if(gender == 1){
            if(age >= 50){
                return type1;
            }else if(age < 50 & age >30){
                return type2;
            }else{
                return 0;
            }
        }else if(gender == 2){
            return type3;
        }else{
            return 0;
        }
    }
}
