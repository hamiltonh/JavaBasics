/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.exercisesjavabasic;

import java.util.Arrays;

/**
 *
 * @author osboxes
 */
//La función ordenamientoPersonalizado recibe como parámetro un vector de números enteros de longitud PAR, su trabajo será retornar el vector ordenado de la siguiente manera:
//
//La primera mitad de los valores deben estar ordenados ascendentemente
//La segunda mitad de los valores deben estar ordenados descendentemente
//El programa debe retornar como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados que lo acompañen.
//
//Ejemplo de entrada:
//
//int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
//
//Salida (Retorno):
//
//int [] vectorEntradaOrdenado = {0, 1, 2, 65, 66, 90, 78, 13, 12, 11};


public class Ejercicio4 {
    
    public static int[] customOrder( int[] vector){
        
        int indexInTheMiddle = vector.length/2;
        
        int[] firstArray = Arrays.copyOfRange(vector, 0, indexInTheMiddle);
        int[] lastArray = Arrays.copyOfRange(vector, indexInTheMiddle, vector.length );
        
        Arrays.sort(firstArray);
        Arrays.sort(lastArray);
        
        int qtyLastArray = lastArray.length-1;
        for (int i = 0; i < vector.length; i++) {
            
             if(i < indexInTheMiddle ){
                vector[i] = firstArray[i];
             } else{
//                System.out.println( qtyLastArray --);
                vector[i] = lastArray[qtyLastArray --]; 
             }
        }
        return vector;
    }
}
