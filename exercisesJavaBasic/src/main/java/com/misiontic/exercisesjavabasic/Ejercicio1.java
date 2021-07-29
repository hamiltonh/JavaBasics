/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.exercisesjavabasic;

import java.util.Scanner;

/**
 *
 * @author osboxes

Ejercicio 1
Número máximo de ficheros: 1
Tipo de trabajo: Individual
Cree un programa en Java que le solicite al usuario un número entero (NO COLOCAR MENSAJES DESCRIPTIVOS PARA LA SOLICITUD DE ESTE, O SU PROGRAMA NO PASARÁ LOS TEST), luego calcule el factorial del número ingresado, y como resultado muestre en la pantalla el factorial del número ingresado. El programa debe mostrar como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados que lo acompañen.

por ejemplo si el usuario ingresa 3 el programa debe mostrar:

6

Elabore su programa en un archivo de Java (formato Ciclo.java). Si omite la extensión le aparecerá un error de compilación.

No deje espacios en blanco en el nombre del archivo. Si el nombre del archivo contiene espacios en blanco, el sistema no lo reconocerá y lo calificará como cero.

Evite utilizar tildes, eñes y caracteres especiales dentro del código, ya que el sistema podría no reconocerlos y generar un mensaje de error.

Recuerde hacer clic en "continuar" al momento de subir el archivo para que el sistema realice la calificación de su programa.

Puede enviar su código para evaluación un número ilimitado de veces antes de la fecha límite de entrega establecida para la actividad.

Advertencia: todos los programas enviados serán analizados por un algoritmo detector de plagios. Los casos de plagio serán reportados al Consejo de Facultad. 

*/


public class Ejercicio1 {
    public static int requestNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero:");
        int numb = scanner.nextInt();
        return numb;
    }
    public static long calculateFactorial(int myNumber){
        long acum = 1;
        for (int i = myNumber; i > 1; i--) {
            acum = acum*i;
        }
        return acum;
    }
}
