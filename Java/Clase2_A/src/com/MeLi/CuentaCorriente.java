package com.MeLi;

public class CuentaCorriente {

    private double saldo;
    private int numeroCuenta;

    public CuentaCorriente() {
    }

    public CuentaCorriente(double saldo, int numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.saldo = cuentaCorriente.getSaldo();
        this.numeroCuenta = cuentaCorriente.getNumeroCuenta();
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    private void ingreso(double saldoAIngresar) {
        this.saldo = this.saldo + saldoAIngresar;
    }

    private void egreso(double saldoARetirar) {
        if (this.saldo >= saldoARetirar) {
            this.saldo = this.saldo - saldoARetirar;
        } else {
            System.out.println("The account dont have enough money");
        }
    }

    private void reintegro() {

    }

    private void transferencia(CuentaCorriente cuentaCorriente, double value) {
        cuentaCorriente.egreso(value);
        this.ingreso(value);
    }


}
