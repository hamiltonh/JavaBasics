/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project3_herencia;

/**
 *
 * @author osboxes
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("juan Zabala", 39);
        System.out.println(employee.getAge());
        
        Leader leader = new Leader("pedro", 25);
        leader.setReponsability("lider-ti");
        System.out.println(leader.getReponsability());
        
        Watchman donJediondo = new Watchman("Don Jediondo", 55); 
        donJediondo.setShift("Noche");
        System.out.println(donJediondo.getShift());
        donJediondo.getPaid();
    }
}
