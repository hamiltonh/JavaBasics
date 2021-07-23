/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project1;

import java.util.Scanner;

/**
 *
 * @author osboxes
 */
public class Exercise1 {
    //private int qtyPeople;
    private Person[] people;

    public void setQtyPeople(int qtyPeople) {
        //this.qtyPeople = qtyPeople;
        this.people = new Person[qtyPeople];
    }
    
    public void setPeopleInfo(){

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < people.length; i++) {
            System.out.println("Ingrese los datos de la persona "+ (i+1));
            System.out.println("Ingrese nombre:");
            String fullName = scanner.nextLine();
            
            System.out.println("Ingrese año de nacimiento:");
            int year = Integer.parseInt( scanner.nextLine());
            
            Person person = new Person(fullName, 10101, year);
            this.people[i] = person;
        }
    }
    
    public void showPeopleInfo(Person[] people){
        
        for(Person person: people){
            if(person != null){
                System.out.println("Informacion de personas:");
                System.out.println("Nombre Persona: " + person.getFullName());
                System.out.println("Edad Persona: " + person.getAge());
            }
           
        }
    }
    
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero de personas:");
        int qty = scanner.nextInt();
        setQtyPeople(qty);
        setPeopleInfo();
        showPeopleInfo(this.people);
        
        Person[] personArray = new Person[10];
        String nombreABuscar= "hamilton";
        personArray = searchFullName(nombreABuscar);
        if(personArray[0] != null){
            System.out.println("Resultado busqueda, de nombre:" + nombreABuscar);
            showPeopleInfo(personArray);
        } else {
            System.out.println("No se encontraron coincidencias. " + nombreABuscar);
        }
    }
    
    public Person[] searchFullName(String fullName){
        Person[] personArray = new Person[10];
        int idxFoundPerson = 0;
        for(Person person: this.people){
            if( fullName.equals(person.getFullName()) ){
                personArray[idxFoundPerson] = person;
                idxFoundPerson++;
            }
        }
        return personArray;
    }
}
