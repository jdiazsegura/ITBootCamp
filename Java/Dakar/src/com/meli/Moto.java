package com.meli;

public class Moto extends Vehiculo{
    private double peso = 300.0;
    private int ruedas = 2;

    public Moto() {
        this.setPeso(peso);
        this.setRuedas(ruedas);
    }

    public Moto(int velocidad, int aceleracion, double anguloDeGiro, String patente) {
        this.setVelocidad(velocidad);
        this.setAceleracion(aceleracion);
        this.setAnguloDeGiro(anguloDeGiro);
        this.setPatente(patente);
        this.setPeso(peso);
        this.setRuedas(ruedas);
    }
}
