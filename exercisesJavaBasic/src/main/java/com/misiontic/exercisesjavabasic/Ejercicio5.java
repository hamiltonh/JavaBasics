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
//La función sumaVectorial recibe como parámetros dos vectores de números enteros 
//DE IGUAL LONGITUD (L), su trabajo será retornar un vector nuevo de números enteros, 
//que es el resultado de hacer la suma vectorial entre los dos vectores recibidos como parámetro.
//
//El programa debe retornar como resultado exclusivamente el valor solicitado,
//no debe contener letras ni enunciados que lo acompañen.
//
//Ejemplo de entrada:
//
//int [] v1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
//
//int [] v2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
//
//Salida (Retorno):
//
//int [] s = {0, 0, 2, 74, 70, 156, 24, 22, 180, 26};
public class Ejercicio5 {
    
    public static int [] sumaVectorial(int [] v1, int [] v2){
        int[] resultArray = new int[v1.length];
        for (int i = 0; i < v2.length; i++) {
            resultArray[i] = v1[i]+v2[i];
        }
        return resultArray;
    }
    
}
