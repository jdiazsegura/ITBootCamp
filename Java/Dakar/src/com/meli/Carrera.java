package com.meli;

import java.util.ArrayList;

public class Carrera {
    double distancia;
    double premioEnDolares;
    String nombre;
    int cantidadDeVehiculosPermitidos;
    ArrayList<Vehiculo> listaDeVehiculos;
    SocorristaAuto socorristaAuto = new SocorristaAuto();
    SocorristaMoto socorristaMoto = new SocorristaMoto();

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(double premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public void setCantidadDeVehiculosPermitidos(int cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public ArrayList<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void setListaDeVehiculos(ArrayList<Vehiculo> listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }

    public void darDeAltaAuto(int velocidad,int aceleracion,double anguloDeGiro,String patente){
        Auto auto = new Auto(velocidad,aceleracion,anguloDeGiro,patente);
        if(cantidadDeVehiculosPermitidos < listaDeVehiculos.size()){
            listaDeVehiculos.add(auto);
        }
    }

    public void darDeAltaMoto(int velocidad,int aceleracion,double anguloDeGiro,String patente){
        Moto moto = new Moto(velocidad,aceleracion,anguloDeGiro,patente);
        if(cantidadDeVehiculosPermitidos < listaDeVehiculos.size()){
            listaDeVehiculos.add(moto);
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(String patente){
        listaDeVehiculos.removeIf(vehiculo -> vehiculo.getPatente() == patente);
    }

    public Vehiculo ganador(){
        var ganador = new Vehiculo();
        var maxValue = 0;
        for (var vehiculo: listaDeVehiculos) {
            var velocidad = vehiculo.getVelocidad();
            var aceleracion = vehiculo.getAceleracion();
            var angulo = vehiculo.getAnguloDeGiro();
            var peso = vehiculo.getPeso();
            var numRuedas = vehiculo.getRuedas();
            var calculo = velocidad * (aceleracion / 2) / (angulo*(peso-numRuedas * 100));
            if (calculo > maxValue){
                ganador = vehiculo;
                maxValue = (int) calculo;
            }
        }

        return ganador;
    }

    public void addSocorristas(){
        listaDeVehiculos.add(socorristaAuto);
        listaDeVehiculos.add(socorristaMoto);
    }

    public void socorrerAuto(String patente){
        socorristaAuto.socorrer(patente);
    }

    public void socorrerMoto(String patente){
        socorristaMoto.socorrer(patente);
    }

}
