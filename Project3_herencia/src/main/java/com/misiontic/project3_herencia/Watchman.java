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
public class Watchman extends Employee{
    
    private String kindOfGun;
    private String area;
    private String shift;

    public Watchman(String fullname, int year) {
        super(fullname, year);
    }

    public String getKindOfGun() {
        return kindOfGun;
    }

    public void setKindOfGun(String kindOfGun) {
        this.kindOfGun = kindOfGun;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
//    public void getPaid(){
//        System.out.println("cobrando salario con extras");
//    }
    
}

