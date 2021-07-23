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
public class Employee extends Person{
    private double salary;
    private String workplace;
    private String schedule;

    public Employee(String fullname, int year) {
        super(fullname, year);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    
    public void getPaid(){
        System.out.println("Cobrando salario");
    }
}
