package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hola");
        Autobus myBus = new Autobus("Pepe", 30, false);

        myBus.moverDerecha(5);
        myBus.gestionarWifi();
        myBus.gestionarAireAcondicionado();
        myBus.gestionarMarcha();
        myBus.gestionarMotor();
        myBus.gestionarMarcha();
        myBus.moverDerecha(5);

        myBus.recogerPasajero(2);
        myBus.gestionarPuerta();
        myBus.moverArriba(10);
        myBus.gestionarMarcha();
        myBus.gestionarPuerta();
        myBus.recogerPasajero(1);
        myBus.recogerPasajero(4);
        myBus.recogerPasajero(6);
        myBus.gestionarWifi();
        myBus.gestionarAireAcondicionado();
        myBus.gestionarMarcha();
        myBus.moverIzquierda(2);
        myBus.dejarPasajero();
        myBus.gestionarMotor();
        System.out.println(myBus.calcularDistanciaAcopio());

        System.out.println(myBus.toString());
    }
}
