package com.company;

import java.util.ArrayList;
import java.util.List;

public class Nomina {

    //Guarda la lista de trabajadores que hacen parte de la nómina de la universidad
    private List<Trabajador> trabajadores;

//    public List<Trabajador> getTrabajadores() {
//        return trabajadores;
//    }

    public ArrayList<Trabajador> getTrabajadores() {
        return (ArrayList) trabajadores;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    //Inserte acá el método constructor
    Nomina (){
        this.trabajadores =  new ArrayList<>();
    }


//    Trabajador t:
//    Es el trabajador por agregar a la lista trabajadores
//    Agrega el trabajador recibido como parámetro a la lista trabajadores si este NO está en la lista
//            (Dos trabajadores son diferentes si sus documentos de identidad son diferentes)
    public void agregarTrabajador(Trabajador t){

        if( !this.trabajadores.contains(t) ) {
            this.trabajadores.add(t);
        }
    }

//    String ID:
//    Documento de
//    identidad del
//    trabajador a
//    eliminar de la lista
//    trabajadores
//    Elimina el trabajador con
//    documento de identidad igual
//    al recibido por parámetro (ID)
    public void eliminarTrabajador(String id){

        for (int i =0; i< this.trabajadores.size(); i++) {
            if( this.trabajadores.get(i).getCC().equals(id) ){
                this.trabajadores.remove(i);
                break;
            }
        }
    }

//    Retorna la suma del salario
//    quincenal de todos los
//    trabajadores
    public double calcularSalarioQuincenalNomina(){
        double acum = 0;
        for(Trabajador t: this.trabajadores) {
            acum += t.salarioQuincenal();
        }

        return acum;
    }

//    Retorna el promedio de edad
//    de todas las personas que
//    hacen parte de la nómina
    public double promedioEdadNomina(){
        double acum = 0;
        int cant = 0;
        for(Trabajador t: this.trabajadores) {
            acum += t.calcularEdad();
            cant++;
        }

        return acum / cant;
    }

//    Retorna la desviación
//    estándar de la edad de todas
//    las personas que hacen parte
//    de la nómina
//    s = sqrt(sum((x_i - mu)**2)/n)
    public double desviacionEstandarEdadNomina(){

        double suma = 0;
        double promedio = this.promedioEdadNomina();

        for(Trabajador t: this.trabajadores){
            suma += Math.pow(t.calcularEdad() - promedio, 2);
        }

        return Math.sqrt( suma /this.trabajadores.size() );
    }

//    String ID:
//    Documento de
//    identidad del
//    trabajador del
//    que se desea         conocer el salario.
//    Retorna el salario quincenal
//    del trabajador cuyo
//    documento de identidad es
//    igual a ID (Si este no se           encuentra, retorna -1)
    public double salarioQuincenalTrabajador(String id){

        double VALUE_NOT_FOUND = -1.0;
        for(Trabajador t: this.trabajadores) {
            if( t.getCC().equals(id) ){
                return t.salarioQuincenal();
            }
        }

        return VALUE_NOT_FOUND;
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "trabajadores=" + trabajadores +
                '}';
    }
}