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

    private int id;
    private String name;
    private String surname;
    private String idnp;

    public Employee() {

    }

    public Employee(String name, String surname, String idnp) {
        this.name = name;
        this.surname = surname;
        this.idnp = idnp;
    }

    public Employee(int id, String name, String surname, String idnp) {
        this(name, surname, idnp);
        this.id = id;
    }
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdnp() {
        return idnp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", idnp=" + idnp + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Comparing Employee");
        if (obj instanceof Employee) {
            Employee compared = (Employee) obj;
            return this.getName().equals(compared.getName())
                    && this.getSurname().equals(compared.getSurname())
                    && this.getIdnp().equals(compared.getIdnp());
        }
        return false;
    }

}
