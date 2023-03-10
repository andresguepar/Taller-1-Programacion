package com.java.ex4;

import java.util.SortedMap;

public class PrinLights {
    public static void main(String[] args) {
        Lights lights = new Lights();
        lights.status = true;
        int option;
        int num = (int)(Math.random()*3+1);

        System.out.println("Status: " + lights.statusLight());

        option = num;

        switch(option){
            case 1:
                lights.color = "Green";
                System.out.println(lights.changeColor());
                break;
            case 2:
                lights.color = "Yellow";
                System.out.println(lights.changeColor());
                break;
            case 3:
                lights.color = "Red";
                System.out.println(lights.changeColor());
                break;
            default:
                System.out.println("Not Found");
        }
        System.out.println(lights.showMessage());
    }
}
