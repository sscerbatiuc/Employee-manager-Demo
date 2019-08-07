package com.tekwill.service;

import com.tekwill.exception.UserAlreadyExistsException;
import com.tekwill.model.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sscerbatiuc
 */
public class InMemoryEmployeeService {

    private static List<Employee> empArrList = new ArrayList<Employee>();

    public InMemoryEmployeeService() {
        System.out.println("Created new array list");
    }

    // add, edit, delete
    public void add(Employee emp) {
        empArrList.add(emp);
    }

    public void remove(int index) {
        empArrList.remove(index);
    }

    public void remove(Employee emp) {
        System.out.println("Removing " + emp);
        empArrList.remove(emp);
    }

    public void exists(Employee emp) throws UserAlreadyExistsException {
        boolean exists = empArrList.contains(emp);
        if (exists) {
            throw new UserAlreadyExistsException(emp + " already exists");
        }
    }

    public void displayInConsole() {
        System.out.println("Displaying data");
        for (Employee emp : empArrList) {
            System.out.println(emp);
        }
    }
}
