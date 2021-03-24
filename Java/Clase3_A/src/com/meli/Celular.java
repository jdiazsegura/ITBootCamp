package com.meli;

public class Celular implements Precedable<Celular> {

    private String titular;
    private int numero;

    public Celular() {
    }

    public Celular(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int precedeAT(Celular celular) {
        int precede = precedeAT(celular);
        return precede;
    }

    @Override
    public int compareTo(Celular celular) {
        int resultado = 0;
        if (this.numero < celular.numero) {
            resultado = -1;
        } else if (this.numero > celular.numero) {
            resultado = 1;
        } else {
            resultado = 0;
        }
        return resultado;
    }

}
