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
//La función sumaPares recibe como parámetro un vector de números enteros,
//u trabajo será retornar la suma de los números PARES POSITIVOS que hay en el vector dado.
//Ejemplo de entrada:

//int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
//
//Salida (Retorno):
//
//248
//
//Explicación:
//
//0 + 2 + 66 + 78 + 12 + 90 = 248
public class Ejercicio2 {
    static long SumPairsNumbers( int[] vector){
        long acum = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] % 2 == 0 && vector[i]>0 ){
                acum += vector[i];
//                System.out.println("::"+acum);
            }
        }
        return acum;
    }
}
