/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.exercisesjavabasic;

/**
 *
 * @author osboxes
 */

//La función join recibe como parámetro un vector de caracteres, su trabajo será retornar una cadena de caracteres que es el resultado de concatenar todos los caracteres del vector.
//
//El programa debe retornar como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados que lo acompañen.
//
//Ejemplo de entrada:
//
//char [] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'};
//
//Salida (Retorno):
//
//String vectorConcatenado = " Pro gra mar";
//
//Note cómo se manejan los espacios en blanco (Debe concatenarlos, NO eliminarlos).
//
//Evite utilizar tildes, eñes y caracteres especiales dentro del código, ya que el sistema podría no reconocerlos y generar un mensaje de error.

public class Ejercicio6 {
     public static String join(char [] vector){
         String cadena = "";
         for (int i = 0; i < vector.length; i++) {
             cadena += vector[i];
         }
         return cadena;
     }
}
