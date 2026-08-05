package com.equalhashcodemethods;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        employeeArrayList.add(new Employee(101,"Sujay",80000.0,"Developer"));
        employeeArrayList.add(new Employee(101,"Sujay",80000.0,"Developer"));

        System.out.println(employeeArrayList.get(0).equals(employeeArrayList.get(1)));

        System.out.println(employeeArrayList.get(0).hashCode());
        System.out.println(employeeArrayList.get(1).hashCode());
    }
}
