/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project2_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author juanz
 */
public class Main {
    public static void main(String[] args) {
        // Declaraci´n de arraylist
        ArrayList<String> people = new ArrayList<String>();
        people.add("Juan");
        people.add("Luis");
        people.add("Juan");
        
        System.out.println(people.contains("Juan"));
        people.removeAll(Collections.singleton("Juan")); //remover todas las ocurrencias
        //people.remove(0); //remove por posicion
        //people.remove("Juan");//remove primera ocurrencia

        System.out.println(people.size());
        Iterator<String> iterator = people.iterator();
        
        while(iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }
        for(int i=0; i<people.size(); i++){
            String item = people.get(i);
            System.out.println(item);
        }
        
        
    }
}