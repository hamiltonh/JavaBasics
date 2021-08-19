/*
Preguntas:
En el constructor se  incluyen validaciones?
*/

package com.company;

public class CuentaCorriente extends CuentaBanco{

    private double cuotaManejo;

    CuentaCorriente(String numeroCuenta, String nombrePropietario, double saldo, double cuotaManejo) {
        super(numeroCuenta, nombrePropietario, saldo);
        this.cuotaManejo = cuotaManejo;
    }

    public double getCuotaManejo() {
        return cuotaManejo; //Costo Mensual
    }

    public void setCuotaManejo(double cuotaManejo) {
        this.cuotaManejo = cuotaManejo;
    }
    //Resta al saldo el valor de la cuota de manejo.
    //El cobro de la cuota de manejo puede resultar en saldo negativo.
    public void cobrarCuotaManejo() {
        this.setSaldo( this. getSaldo() - this.cuotaManejo);
    }
}
