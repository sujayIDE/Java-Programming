package com.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Employee> employeeSet=new HashSet<>();
        employeeSet.add(new Employee(101,"Rohit",4000.0));
        employeeSet.add(new Employee(102,"Ajay",5000.0));
        employeeSet.add(new Employee(103,"Kumar",3000.0));
        employeeSet.add(new Employee(101,"John",4000.0));

        //display employees
        for(Employee employee:employeeSet)
        {
            System.out.println(employee);
        }

        System.out.println();

        //search employee with id
        for(Employee employee:employeeSet)
        {
            if(employee.getEmployee_id()==102)
            {
                System.out.println(employee);
            }
        }

        System.out.println();

        System.out.println("Enter Id to remove : ");
        int id=sc.nextInt();
        //remove employee
        boolean flag=false;
        for(Employee employee:employeeSet)
        {
            if(employee.getEmployee_id()==id)
            {
                 employeeSet.remove(employee);
                System.out.println("Removed");
                flag=true;
                break;
            }
        }

        if(!flag)
        {
            System.out.println("Employee not found");
        }

        for(Employee employee:employeeSet)
        {
            System.out.println(employee);
        }

        //total no of unique employee
        System.out.println("Employee size : "+employeeSet.size());

    }
}
