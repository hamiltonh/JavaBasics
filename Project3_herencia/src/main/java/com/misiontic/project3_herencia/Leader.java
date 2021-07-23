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
public class Leader extends Employee {
    private int numPople;
    private String reponsability;

    public Leader(String fullname, int year) {
        super(fullname, year);
    }

    public int getNumPople() {
        return numPople;
    }

    public void setNumPople(int numPople) {
        this.numPople = numPople;
    }

    public String getReponsability() {
        return reponsability;
    }

    public void setReponsability(String reponsability) {
        this.reponsability = reponsability;
    }
    
    public void getPaid(){
        System.out.println("Cobrando salario con bonificación");
    }
    
}
