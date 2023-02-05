package com.java.ex24;
import java.util.Scanner;
public class PrinGameOff {


        public static void main(String[] args) {

            GameOff gameOff = new GameOff();
            Scanner x = new Scanner(System.in);
            gameOff.carta1Uno =    (int)(Math. random()*10+1);
            gameOff.carta2Uno =    (int)(Math. random()*10+1);
            gameOff.carta3Uno =    (int)(Math. random()*10+1);
            gameOff.carta1Dos =    (int)(Math. random()*10+1);
            gameOff.carta2Dos =    (int)(Math. random()*10+1);
            gameOff.carta3Dos =    (int)(Math. random()*10+1);

            System.out.println("empezo el juego....");
            System.out.println("Jugador 1 \n carta 1 :"+ gameOff.carta1Uno + " carta 2: "+ gameOff.carta2Uno);
            System.out.println("Jugador 2 \n carta 1: "+ gameOff.carta1Dos + " carta 2: "+ gameOff.carta2Dos);
            System.out.println("oprima cualquier tecla para ver resultados...");

            System.out.println("Jugador 1 \n carta: 1 "+ gameOff.carta3Uno);
            System.out.println("Jugador 2 \n carta: 1 "+ gameOff.carta3Dos);
            gameOff.jugar();
        }
    }