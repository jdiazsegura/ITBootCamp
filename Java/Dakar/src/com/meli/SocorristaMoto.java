package com.meli;

public class SocorristaMoto extends Vehiculo {

    public void socorrer(String moto) {
        System.out.println("Socorriendo moto: " + moto.getPatente());
    }
}
