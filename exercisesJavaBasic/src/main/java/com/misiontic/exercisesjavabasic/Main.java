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
public class Main {
    public static void main(String[] args) {

        //EXERCISE1 FACTORIAL
        int numb = Ejercicio1.requestNumber();
        System.out.println("E1 Factorial: " + Ejercicio1.calculateFactorial(numb));

        //Exercise 2 sumPairs
        int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        System.out.println("E2 Sumpairs:"+Ejercicio2.SumPairsNumbers(vectorEntrada));
        
        //Exercise 3 Average calc
        int [] vectorEntrada2 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        System.out.println("E3 AVG: " + Ejercicio3.calcAverage(vectorEntrada2));
        
//        Exercise 4   Custom morder
        int [] vectorEntrada4= {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int[] result = Ejercicio4.customOrder(vectorEntrada4);
        System.out.println("E4:");
        System.out.printf(Arrays.toString(result));  
        System.out.println("");

//        Exercise 5 Suma Vectorial
        int [] v1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int [] v2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
        int[] result2 = Ejercicio5.sumaVectorial(v1,v2);
        System.out.println("E5:");
        System.out.printf(Arrays.toString(result2));  
        System.out.println("");
        
//        Exercise 6 Join chars
        char [] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'};
        System.out.println("E6: " + Ejercicio6.join(vector));
        
    }
}
