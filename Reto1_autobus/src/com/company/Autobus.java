package com.company;

//@author hamiltonhernandez@gmail.com
public class Autobus {

    private String nombreConductor;
    private int nPasajeros;
    private double cantidadDinero;
    private int nMaximoPasajeros;
    private double localizacionX;
    private double localizacionY;
    private double localizacionAcopioX;
    private double localizacionAcopioY;
    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado;
    private boolean motorEncendido;
    private boolean wifiEncendido;
    private boolean enMarcha;

    @Override
    public String toString() {
        return "Autobus{" +
                "nombreConductor='" + nombreConductor + '\'' +
                ", nPasajeros=" + nPasajeros +
                ", cantidadDinero=" + cantidadDinero +
                ", nMaximoPasajeros=" + nMaximoPasajeros +
                ", localizacionX=" + localizacionX +
                ", localizacionY=" + localizacionY +
//                ", localizacionAcopioX=" + localizacionAcopioX +
//                ", localizacionAcopioY=" + localizacionAcopioY +
                ", puertaAbierta=" + puertaAbierta +
                ", aireAcondicionadoActivado=" + aireAcondicionadoActivado +
                ", motorEncendido=" + motorEncendido +
                ", wifiEncendido=" + wifiEncendido +
                ", enMarcha=" + enMarcha +
                '}';
    }

    Autobus(String nombreConductor, int nMaximoPasajeros, boolean puertaAbierta){
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.puertaAbierta = puertaAbierta;
        this.nPasajeros = 0;
        this.cantidadDinero = 0;
        this.localizacionX = 0.0;
        this.localizacionY = 0.0;
        this.localizacionAcopioX = 0.0;
        this.localizacionAcopioY = 0.0;
        this.aireAcondicionadoActivado = false;
        this.motorEncendido = false;
        this.wifiEncendido = false;
        this.enMarcha = false;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    //El autob??s no podr?? cambiar sus coordenadas geogr??ficas mientras el autob??s no se encuentre en marcha.
    public void setLocalizacionX(double localizacionX) {
        if(this.isEnMarcha()){
            this.localizacionX = localizacionX;
        }
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    //El autob??s no podr?? cambiar sus coordenadas geogr??ficas mientras el autob??s no se encuentre en marcha.
    public void setLocalizacionY(double localizacionY) {
        if(this.isEnMarcha()) {
            this.localizacionY = localizacionY;
        }
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }


    public void setPuertaAbierta(boolean puertaAbierta) {
            this.puertaAbierta = puertaAbierta;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    //El  Wifi  y  el  aire  acondicionado  estar??n  apagados  siempre  que  el  motor est?? apagado.
    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;

        if(!this.motorEncendido){
            this.setWifiEncendido(false);
            this.setAireAcondicionadoActivado(false);
        }
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    //  Estrato de la persona que recogi?? Suma el costo del pasaje pagado por el pasajero a cantidadDinero
    //  Para poder que una persona se suba, la puerta debe estar abierta, y en consecuencia el autob??s no puede estar en marcha.
    // si  el  autob??s  est??  completamente lleno,  el conductor  solo podr?? abrir la  puerta  para  dejar  bajar
    // uno  o  m??s  pasajeros ,  y cobrar??  el  precio  del adem??s  de  que  el  sistema pasaje  dependiendo  del
    // estrato  socioecon??mico  del pasajero
    public void recogerPasajero(int estrato) {

        if( this.isEnMarcha()  || this.getnPasajeros() >= this.getnMaximoPasajeros() ){
            System.out.println("Error recogerPasajero");
//            System.out.println("this.isEnMarcha() " + this.isEnMarcha() );
//            System.out.println("this.getnPasajeros() " + this.getnPasajeros() );
            return;
        }

        double precioCOP = 0;
        switch (estrato){
            case 0:
            case 1:
            case 2:
                precioCOP = 1500;
                break;
            case 3:
            case 4:
                precioCOP = 2600;
                break;
            case 5:
            case 6:
                precioCOP = 3000;
                break;
        }
        this.setCantidadDinero( this.getCantidadDinero() + precioCOP );
        this.setnPasajeros(this.getnPasajeros() + 1);
    }

    //  Resta 1 a nPasajeros
    //  Para  poder  que  una  persona  se  baje,  la  puerta  debe estar  abierta,
    //  y  en consecuencia el  autob??s  no  puede estar  en  marcha.
    public void dejarPasajero() {

        int qtyPasajeros = this.getnPasajeros();
        if ( !this.isEnMarcha() && this.isPuertaAbierta() && qtyPasajeros > 0) {
            this.setnPasajeros(qtyPasajeros - 1);
        } else {
            System.out.println("Error getnPasajeros!");
            return;
        }
    }

    //Retorna la distancia entre el origen de coordenadas y el punto en el que se encuentra el autob??s.
    public double calcularDistanciaAcopio() {
        //Ubicaci??n del acopio para el ejercicio siempre ser??: pos 0.0, 0.0
        double distX = Math.abs(this.localizacionAcopioX - this.getLocalizacionX() );
        double distY = Math.abs(this.localizacionAcopioY - this.getLocalizacionY() );

        return  Math.sqrt( Math.pow( distX, 2)  + Math.pow( distY, 2) );

    }

    // Abre la puerta si est?? cerrada al invocar este m??todo y viceversa
    // (El abrir o cerrar la puerta no se ve afectado por el estado encendido del motor)
    //La  puerta  del  autob??s  debe  permanecer  cerrada  siempre  que  est??  en marcha.
    public void gestionarPuerta() {
        this.setPuertaAbierta( this.isEnMarcha() ? false :  !this.puertaAbierta);
    }

    // Enciende el aire acondicionado si est?? apagado al invocar este m??todo y viceversa
    // //El  Wifi  y  el  aire  acondicionado  estar??n  apagados  siempre  que  el  motor est?? apagado.
    public void gestionarAireAcondicionado() {
       if(this.isMotorEncendido()) {
           this.setAireAcondicionadoActivado( !this.aireAcondicionadoActivado);
       }
    }

    //Enciende el motor si est?? apagado al invocar este m??todo y viceversa
    public void gestionarMotor() {
        this.setMotorEncendido( !this.motorEncendido );
    }

    // Enciende el wifi si est?? apagado al invocar este m??todo y viceversa
    ////El  Wifi  y  el  aire  acondicionado  estar??n  apagados  siempre  que  el  motor est?? apagado.
    public void gestionarWifi(){
        if(this.isMotorEncendido()) {
            this.setWifiEncendido( !this.wifiEncendido );
        }
    }

    //Activa la marcha del autob??s si est?? parado al invocar este m??todo y viceversa
    //El  autob??s  no  podr??  avanzar  hasta  que  el  conductor  cierre  la  puerta despu??s de recoger un  pasajero
    //Para poder que el autob??s est?? en marcha, el motor deber?? estar encendido (Pero si el motor est?? encendido no necesariamente debe estar en marcha).
    public void gestionarMarcha() {
        if( !this.isMotorEncendido()
            || (!this.enMarcha && this.puertaAbierta)){
            System.out.println("Error gestionarMarcha");
            return;
        }
        this.setEnMarcha( !this.enMarcha );
    }

    //Cantidad de km a mover el autob??s a la derecha. Suma ???? a localizacionX
    public void moverDerecha(double distancia){
        this.setLocalizacionX( this.getLocalizacionX() + distancia);
    }

    //Cantidad de km a mover el autob??s a la izquierda. Resta ???? a localizacionX
    public void moverIzquierda(double distancia) {
        this.setLocalizacionX( this.getLocalizacionX() - distancia);
    }

    //Cantidad de km a mover el autob??s hacia arriba. Suma ???? a localizacionY
    public void moverArriba (double distancia) {
        this.setLocalizacionY( this.getLocalizacionY() + distancia);
    }

    //Cantidad de km a mover el autob??s hacia abajo. Resta ???? a localizacionY
    public void moverAbajo ( double distancia) {
        this.setLocalizacionY( this.getLocalizacionY() - distancia);
    }
}
