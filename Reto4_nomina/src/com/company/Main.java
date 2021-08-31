package com.company;

public class Main {

    public static void main(String[] args) {

        Nomina myNomina = new Nomina();
        Trabajador trabajador = new Trabajador("Hamilton", "16932374", 10000.0, 48, 28, 5, 1981);
        System.out.println(myNomina);
        myNomina.agregarTrabajador(trabajador);
        myNomina.agregarTrabajador(trabajador);
        System.out.println(myNomina);

        Trabajador t1 = new Trabajador("Mat", "1037681391", 67000.0, 80, 23, 1, 2000);
        Trabajador t2 = new Trabajador("Johan", "33277591", 20000.0, 96, 24, 5, 1970);
        Trabajador t3 = new Trabajador("Paulo", "1032678245", 40000.0, 96, 7, 3, 2001);

        myNomina.agregarTrabajador(t1);
        myNomina.agregarTrabajador(t2);
        myNomina.agregarTrabajador(t3);
        System.out.println(myNomina);
    }
}


