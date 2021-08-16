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

    //El autobús no podrá cambiar sus coordenadas geográficas mientras el autobús no se encuentre en marcha.
    public void setLocalizacionX(double localizacionX) {
        if(this.isEnMarcha()){
            this.localizacionX = localizacionX;
        }
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    //El autobús no podrá cambiar sus coordenadas geográficas mientras el autobús no se encuentre en marcha.
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

    //El  Wifi  y  el  aire  acondicionado  estarán  apagados  siempre  que  el  motor esté apagado.
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

    //  Estrato de la persona que recogió Suma el costo del pasaje pagado por el pasajero a cantidadDinero
    //  Para poder que una persona se suba, la puerta debe estar abierta, y en consecuencia el autobús no puede estar en marcha.
    // si  el  autobús  está  completamente lleno,  el conductor  solo podrá abrir la  puerta  para  dejar  bajar
    // uno  o  más  pasajeros ,  y cobrará  el  precio  del además  de  que  el  sistema pasaje  dependiendo  del
    // estrato  socioeconómico  del pasajero
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
    //  y  en consecuencia el  autobús  no  puede estar  en  marcha.
    public void dejarPasajero() {

        int qtyPasajeros = this.getnPasajeros();
        if ( !this.isEnMarcha() && this.isPuertaAbierta() && qtyPasajeros > 0) {
            this.setnPasajeros(qtyPasajeros - 1);
        } else {
            System.out.println("Error getnPasajeros!");
            return;
        }
    }

    //Retorna la distancia entre el origen de coordenadas y el punto en el que se encuentra el autobús.
    public double calcularDistanciaAcopio() {
        //Ubicación del acopio para el ejercicio siempre será: pos 0.0, 0.0
        double distX = Math.abs(this.localizacionAcopioX - this.getLocalizacionX() );
        double distY = Math.abs(this.localizacionAcopioY - this.getLocalizacionY() );

        return  Math.sqrt( Math.pow( distX, 2)  + Math.pow( distY, 2) );

    }

    // Abre la puerta si está cerrada al invocar este método y viceversa
    // (El abrir o cerrar la puerta no se ve afectado por el estado encendido del motor)
    //La  puerta  del  autobús  debe  permanecer  cerrada  siempre  que  esté  en marcha.
    public void gestionarPuerta() {
        this.setPuertaAbierta( this.isEnMarcha() ? false :  !this.puertaAbierta);
    }

    // Enciende el aire acondicionado si está apagado al invocar este método y viceversa
    // //El  Wifi  y  el  aire  acondicionado  estarán  apagados  siempre  que  el  motor esté apagado.
    public void gestionarAireAcondicionado() {
       if(this.isMotorEncendido()) {
           this.setAireAcondicionadoActivado( !this.aireAcondicionadoActivado);
       }
    }

    //Enciende el motor si está apagado al invocar este método y viceversa
    public void gestionarMotor() {
        this.setMotorEncendido( !this.motorEncendido );
    }

    // Enciende el wifi si está apagado al invocar este método y viceversa
    ////El  Wifi  y  el  aire  acondicionado  estarán  apagados  siempre  que  el  motor esté apagado.
    public void gestionarWifi(){
        if(this.isMotorEncendido()) {
            this.setWifiEncendido( !this.wifiEncendido );
        }
    }

    //Activa la marcha del autobús si está parado al invocar este método y viceversa
    //El  autobús  no  podrá  avanzar  hasta  que  el  conductor  cierre  la  puerta después de recoger un  pasajero
    //Para poder que el autobús esté en marcha, el motor deberá estar encendido (Pero si el motor está encendido no necesariamente debe estar en marcha).
    public void gestionarMarcha() {
        if( !this.isMotorEncendido()
            || (!this.enMarcha && this.puertaAbierta)){
            System.out.println("Error gestionarMarcha");
            return;
        }
        this.setEnMarcha( !this.enMarcha );
    }

    //Cantidad de km a mover el autobús a la derecha. Suma 𝑑 a localizacionX
    public void moverDerecha(double distancia){
        this.setLocalizacionX( this.getLocalizacionX() + distancia);
    }

    //Cantidad de km a mover el autobús a la izquierda. Resta 𝑑 a localizacionX
    public void moverIzquierda(double distancia) {
        this.setLocalizacionX( this.getLocalizacionX() - distancia);
    }

    //Cantidad de km a mover el autobús hacia arriba. Suma 𝑑 a localizacionY
    public void moverArriba (double distancia) {
        this.setLocalizacionY( this.getLocalizacionY() + distancia);
    }

    //Cantidad de km a mover el autobús hacia abajo. Resta 𝑑 a localizacionY
    public void moverAbajo ( double distancia) {
        this.setLocalizacionY( this.getLocalizacionY() - distancia);
    }
}
