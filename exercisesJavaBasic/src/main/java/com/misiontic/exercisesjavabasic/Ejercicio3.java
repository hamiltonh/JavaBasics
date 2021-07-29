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
//La función mean recibe como parámetro un vector de números enteros,
//su trabajo será retornar la media aritmética (Promedio) de los números que hay en el vector.
//
//El calificador considera un 2% de error debido a posibles aproximaciones.
//
//El programa debe retornar como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados que lo acompañen.
//
//Ejemplo de entrada:
//
//int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
//
//Salida (Retorno):
//
//30.0
//
//Explicación:
//
//(0 + 2 + 1 + 65 + 66 + 78 + 12 + 11 + 90 + 13 + (-8)) / 11 = 30.0
//
//Evite utilizar tildes, eñes y caracteres especiales dentro del código, 
//ya que el sistema podría no reconocerlos y generar un mensaje de error.
public class Ejercicio3 {
    static int calcAverage(int[] vector){
        int acum = 0;
        for (int i = 0; i < vector.length; i++) {
            acum += vector[i];
        }
        return acum / vector.length;
    }
}
