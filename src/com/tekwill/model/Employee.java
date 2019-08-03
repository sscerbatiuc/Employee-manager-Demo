/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekwill.model;

/**
 *
 * @author sscerbatiuc
 */
public class Employee {
    
    private String name;
    private String surname;
    private String idnp;
    
    public Employee(String name, String surname, String idnp){
        this.name = name;
        this.surname = surname;
        this.idnp = idnp;
    }
    
    // getters & setters

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdnp() {
        return idnp;
    }
 
    
    
    
}
