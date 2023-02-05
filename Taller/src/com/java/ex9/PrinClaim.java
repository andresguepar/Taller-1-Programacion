package com.java.ex9;

public class PrinClaim {
        public static void main(String args[]) {
            Claim claim = new Claim();

            claim.numeroReclamo = 12344;
            claim.setNombrePersona("Eliptik");
            claim.setAsunto("shipping delay");
            claim.descripcionReclamos = "It was sent 7 days ago and it has not arrived";
            claim.setEstadoReclamo("in review");

            System.out.println(claim.validarEstadoReclamo());
            System.out.println(claim.mensajeRecepcionReclamo());

        }
    }
