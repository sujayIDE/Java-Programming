package com.arraylist.comparable.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();
        employees.addAll(
                Arrays.asList(
                        new Employee(101,40000),
                        new Employee(102,50000),
                        new Employee(103,20000),
                        new Employee(104,25000),
                        new Employee(105,60000)
                )
        );

        employees.sort(null);
        for (Employee employee:employees)
        {
            System.out.println(employee);
        }
    }
}
