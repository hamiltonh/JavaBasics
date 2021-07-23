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
public class Main {
    public static void main(String[] args) {
        
        Cat cat = new Cat();
        cat.makeSound();
        cat.walk();
        
        Animal cat = new Cat();
        cat.makeSound(); //POlimorfismo, Animal accede al metodo especializado de la clase Cat, makeSound, siendo de tipo Animal
        cat.walk();//Animal no tiene acceso a los metodos specializados de Cat.
        
//        Bird bird = new Bird();
//        bird.makeSound("Sonido inventado.."); //Sobrecarga del metodo en la clase Bird
    }
}
