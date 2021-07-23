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
public class Bird extends Animal{
    
    public void type(){
        System.out.println("Aereo");
    }
    public void makeSound(){
        System.out.println("trinar");
    }
    public void makeSound(String sound){
        System.out.println(sound);
    }
}
