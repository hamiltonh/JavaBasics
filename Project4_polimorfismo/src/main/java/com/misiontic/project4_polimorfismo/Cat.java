/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project4_polimorfismo;

/**
 *
 * @author osboxes
 */
public class Cat extends Animal{
    public void type(){
        System.out.println("Felino");
    }
    
    public void makeSound(){
        System.out.println("miau");
    }
    
    public void walk(){
        System.out.println("Gato moviendose..");
    }
}
