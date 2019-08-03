/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekwill.service;

import com.tekwill.model.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sscerbatiuc
 */
public class InMemoryEmployeeService {
    private List<Employee> empArrList = new ArrayList<Employee>();
// add, edit, delete
    
    public void add(Employee emp){
        empArrList.add(emp);
    }
    
    public void displayInConsole(){
        for(Employee emp: empArrList){
            System.out.println(emp);
        }
    }
}
