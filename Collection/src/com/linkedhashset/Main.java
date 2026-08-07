package com.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Employee> employeeLinkedHashSet =new LinkedHashSet<>();
        employeeLinkedHashSet.add(new Employee(101, "Ajay", 2000.0, "IT"));
        employeeLinkedHashSet.add(new Employee(202, "Rohit", 1000.0, "Developer"));
        employeeLinkedHashSet.add(new Employee(303, "Vijay", 3000.0, "Testing"));
        employeeLinkedHashSet.add(new Employee(404, "Amit", 2500.0, "HR"));
        employeeLinkedHashSet.add(new Employee(505, "Suresh", 4000.0, "Finance"));

        //display all employee
        for(Employee employee: employeeLinkedHashSet)
        {
            System.out.println(employee);
        }
        System.out.println("===========================================");

        //display usinng iterator
        Iterator<Employee> employeeIterator=employeeLinkedHashSet.iterator();
        while(employeeIterator.hasNext())
        {
             Employee e=employeeIterator.next();
            System.out.println(e);
        }
        System.out.println("-======================================");

        //Q3. Retrieve and print only the first employee using Iterator. Don't remove it.
        Iterator<Employee> employeeIterator1=employeeLinkedHashSet.iterator();
        if(employeeIterator1.hasNext())
        {
            System.out.println(employeeIterator1.next());
        }
        System.out.println("==================================================");

        //Q4. Remove only the first employee using Iterator, then print the remaining employees.
        Iterator<Employee> employeeIterator2 =employeeLinkedHashSet.iterator();
        if(employeeIterator2.hasNext())
        {
            employeeIterator2.next();
            employeeIterator2.remove();
        }
        while (employeeIterator2.hasNext())
        {
            System.out.println(employeeIterator2.next());
        }

        System.out.println("===================================================");

        //Q5. Retrieve and print the second employee using Iterator, without removing it.
        Iterator<Employee> employeeIterator3=employeeLinkedHashSet.iterator();
        if (employeeIterator3.hasNext())
        {
            employeeIterator3.next();
            System.out.println(employeeIterator3.next());
        }
        System.out.println("==================================================================");

        //Q6. Remove the third employee using Iterator.
        Iterator<Employee> employeeIterator4=employeeLinkedHashSet.iterator();
        if(employeeIterator4.hasNext())
        {
            employeeIterator4.next();
            employeeIterator4.next();
            employeeIterator4.next();
            employeeIterator4.remove();
        }
        Iterator<Employee> itr=employeeLinkedHashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("===============================================");
        //Check whether an employee with ID 303 exists using contains()
       for(Employee employee:employeeLinkedHashSet)
       {
           if(employee.getId()==303)
           {
               System.out.println(employee);
           }
       }

        System.out.println("==========================================================");
       //LinkedHashSet Size
        System.out.println(employeeLinkedHashSet.size());
    }
}
