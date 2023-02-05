package com.java.ex21;

public class Autos {
    public int modelo;
        public String avisoUsuario() {
            if (modelo == 119 || modelo == 179 || modelo == 189 || modelo == 190 || modelo == 191 || modelo == 192 || modelo == 193 || modelo == 194 || modelo == 195 || modelo == 221 || modelo == 780)
                return "El automovil está defectuoso, llevar a garantía";
            else {
                return "Su automovil no está defectuoso";
            }

        }
    }

