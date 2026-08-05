package com.hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Employee> employeeHashSet=new HashSet<>();
        employeeHashSet.add(new Employee(101,"Ajay",2000.0,"IT"));
        employeeHashSet.add(new Employee(202,"Rohit",1000.0,"Develoepr"));
        employeeHashSet.add(new Employee(101,"Ajay",2000.0,"IT"));
        employeeHashSet.add(new Employee(202,"Rohit",1000.0,"Develoepr"));
        employeeHashSet.add(new Employee(101,"Ajay",2000.0,"IT"));
        employeeHashSet.add(new Employee(202,"Rohit",1000.0,"Develoepr"));
        employeeHashSet.add(new Employee(101,"Ajay",2000.0,"IT"));
        employeeHashSet.add(new Employee(202,"Rohit",1000.0,"Develoepr"));
        employeeHashSet.add(new Employee(101,"Ajay",2000.0,"IT"));
        employeeHashSet.add(new Employee(202,"Rohit",1000.0,"Develoepr"));

        for(Employee employee:employeeHashSet)
        {
            System.out.println(employee);
        }

    }
}
