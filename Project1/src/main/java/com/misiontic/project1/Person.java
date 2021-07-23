/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project1;

//import com.sun.xml.internal.fastinfoset.tools.StAX2SAXReader;
//import javax.xml.transform.Source;
import java.time.YearMonth;

/**
 *
 * @author osboxes
 */
public class Person {
    
    private String fullName;
    private int age;
    private int id;
    private int bornYear;
    static final int CURRENT_YEAR =  YearMonth.now().getYear();

    public Person(String fullName, int id, int bornYear) {
        //this.fullName = fullName;
        setFullName(fullName);
        this.id = id;
        //this.bornYear = bornYear;
        setAge ( calculateAgeByBornYear(bornYear) );
    }
    
    public Person(String fullName, int age){
        //this.fullName = fullName;
        setFullName(fullName);
        //this.age = age;
        setAge(age);
    }
    
    private int calculateAgeByBornYear(int bornYear){
        return CURRENT_YEAR - bornYear;
    }
     
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void walk(){
        System.out.println("Estoy caminando!");
    }
    
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age > 150){
             System.out.println("Error edad!");
        } else {
            this.age=age;
        }
}
