package com.company;

public class CuentaAhorro extends CuentaBanco{

    CuentaAhorro(String numeroCuenta, String nombrePropietario, double saldo) {
        super(numeroCuenta, nombrePropietario, saldo);
    }

    //Retorna el valor de la tasa de IEA correspondiente según las condiciones expuestas anteriormente.
    //    La cuenta de ahorro paga al usuario una tasa de interés efectivo anual (IEA) del 1% (0.01)
    //    para un saldo menor a $1’000.000, 1.75% (0.0175) para un saldo mayor o igual a $1’000.000
    //    y menor a $2’000.000, y 2.3% (0.023) para un saldo mayor o igual a $2’000.000 pesos,
    //    el banco reconoce intereses diarios sobre saldos diarios.
    // Teniendo claras las condiciones para conocer IEA podemos calcular el saldo más el interés diario
    //Tutor:  en la documentación se especifica que getIEA() debe retornar el interés efectivo anual (IEA
    public double getIEA() {
        double IEA = 0.0;
        final double saldo = this.getSaldo();

        if( saldo < 1000000 ){
            IEA = 0.01;
        } else if ( saldo >= 1000000 && saldo < 2000000 ) {
            IEA = 0.0175;
        } else if (saldo >= 2000000) {
            IEA = 0.023;
        }

        return IEA;
    }

    //𝑆𝑎𝑙𝑑𝑜  = 𝑆𝑎𝑙𝑑𝑜 · (1  +   𝐼𝐸𝐴 / 365)
    //El número de días sobre los que se va a calcular el interés debe de ser   mayor o igual a 1.
    //int dias: la cantidad de     días que han pasado     con el saldo     constante.
    //Suma al saldo el     interés diario por     cada día     transcurrido.
    public void pagarInteres(int dias) {

        if(dias > 0){

            for (int i = 0; i < dias; i++) {
                double saldoMasInteres = this.getSaldo();
                saldoMasInteres = saldoMasInteres * (1 + getIEA()/365);
                this.setSaldo(saldoMasInteres);
            }
        }
    }
}
