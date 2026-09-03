package com.hashmap.employeesalarysystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeSalaryManagementSystem {
    public static void main(String[] args) {
        Map<Integer,Double> employeeSalary=new HashMap<>();

        employeeSalary.put(101,3000.0);
        employeeSalary.put(102,35000.0);
        employeeSalary.put(103,23000.0);
        employeeSalary.put(104,45000.0);
        employeeSalary.put(105,20000.0);

        Scanner sc=new Scanner(System.in);
        //Search for an employee's salary using employeeId.
        System.out.println("Enter employee id to search : ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println(employeeSalary.get(id));

        //Update the salary of an existing employee.
        employeeSalary.replace(101,30000.0);
        employeeSalary.replace(102,32000.0);
        employeeSalary.replace(103,35000.0);
        employeeSalary.replace(104,40000.0);
        employeeSalary.replace(105,10000.0);

       //Display all employees.
        for(Map.Entry<Integer, Double> integerDoubleMap:employeeSalary.entrySet()){
            System.out.println(integerDoubleMap.getKey()+"->"+integerDoubleMap.getValue());
        }

    }
}
