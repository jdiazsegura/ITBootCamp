package com.meli;

public class Persona implements Precedable<Persona> {
    String nombre;
    int dni;

    public Persona() {
    }

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int precedeAT(Persona persona) {
        int first = compareTo(persona);
        return first;
    }

    @Override
    public int compareTo(Persona o) {
        int resultado = 0;
        if (this.dni < o.dni) {
            resultado = -1;
        } else if (this.dni > o.dni) {
            resultado = 1;
        } else {
            resultado = 0;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }
}
