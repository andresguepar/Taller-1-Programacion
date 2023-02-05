package com.java.ex23;

public class Sandwich {
        public String tamaño;
        public String tocineta;
        public String pavo;
        public String queso;
        public String jalapeño;
        public int precio;

        public void prep() {
            if (tamaño.equals("Pequeño")) {
                precio += 6000;
            } else {
                precio += 12000;
            }
            if (pavo.equals("Si")) {
                precio += 3000;
            }
            if (tocineta.equals("Si")) {
                precio += 3000;
            }
            if (queso.equals("Si")) {
                precio += 2500;
            }
        }

        public String orderPrice(){
            return "El precio final de su sandwich es: " + precio;
        }
    }

