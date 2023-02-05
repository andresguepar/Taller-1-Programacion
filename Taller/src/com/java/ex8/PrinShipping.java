package com.java.ex8;

public class PrinShipping {

        public static void main(String args[]) {
            Shipping shipping = new Shipping();

            shipping.numeroGuia = 1234;
            shipping.setFecha("4/2/2023");
            shipping.setTipoEmbalaje("Box");
            shipping.cedulaCliente = 123456;
            shipping.setPeso(4);
            shipping.setCiudadOrigen("Ireland");
            shipping.setCiudadDestino("Thailand");
            shipping.setCosto(23000);
            shipping.setEstadoEnvio("Sent");

            System.out.println("The cost per kilo of your shipment is: " + shipping.calcularCostoXKilo() + " since your package has a weight of: " + shipping.getPeso() + "kg");

            System.out.println(shipping.verificarEntrega());


        }
    }

