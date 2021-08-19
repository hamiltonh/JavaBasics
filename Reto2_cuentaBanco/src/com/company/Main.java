package com.company;

public class Main {

    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("1234", "John",50000, 7000);
        c.depositar(600000);
        c.cobrarCuotaManejo();
        c.retirar(150000);

        System.out.println(c.getSaldo());
    }
}
