package com.meli;

public class Auto extends Vehiculo{
    private double peso = 1000.0;
    private int ruedas = 4;

    public Auto() {
        this.setPeso(peso);
        this.setRuedas(ruedas);
    }


    public Auto(int velocidad, int aceleracion, double anguloDeGiro, String patente) {
        this.setVelocidad(velocidad);
        this.setAceleracion(aceleracion);
        this.setAnguloDeGiro(anguloDeGiro);
        this.setPatente(patente);
        this.setPeso(peso);
        this.setRuedas(ruedas);
    }
}
