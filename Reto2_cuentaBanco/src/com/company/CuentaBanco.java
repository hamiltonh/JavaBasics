package com.company;

public class CuentaBanco {

    private String numeroCuenta;
    private String nombrePropietario;
    private Double saldo;

//    Construct
    CuentaBanco(String numeroCuenta, String nombrePropietario, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombrePropietario = nombrePropietario;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    public void depositar(double cant) {
        this.saldo += cant;
    }

    //Resta c al saldo sic + 0.05 * ces menor o igual al saldo.
    //Por cada retiro el banco cobra el 5% del valor a retirar (comisión).
    // El retiro no se realiza si el valor a retirar más la comisión es mayor al saldo.
    public void retirar( double cant) {
        final double COMISION = 0.05;
        double cantFinal = cant + cant * COMISION;
        if( cantFinal <= this.getSaldo()) {
            this.setSaldo( this.getSaldo() - cantFinal);
        }
    }

}
