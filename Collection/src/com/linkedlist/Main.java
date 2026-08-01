package com.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <Employee> employeeList=new LinkedList<>();

        employeeList.add(new Employee(101, "John", 5000.0, "Research"));
        employeeList.add(new Employee(107, "Turner", 4000.0, "Sales"));
        employeeList.add(new Employee(103, "David", 5000.0, "IT"));
        employeeList.add(new Employee(105, "Miller", 7000.0, "Research"));
        employeeList.add(new Employee(102, "Jack", 6000.0, "Accounting"));
        employeeList.add(new Employee(104, "Mary", 7500.0, "HR"));
        employeeList.add(new Employee(106, "Wilson", 5000.0, "IT"));
        employeeList.add(new Employee(108, "Emma", 5000.0, "HR"));

        //addFirst()
        employeeList.addFirst(new Employee(201,"Rohit",3000.0,"Developer"));

        for(Employee employee:employeeList)
        {
            System.out.println(employee);
        }

        //pollFirst()
        Employee e=employeeList.pollFirst();
        System.out.println(e);

        System.out.println();

        for(Employee employee:employeeList)
        {
            System.out.println(employee);
        }

    }
}
