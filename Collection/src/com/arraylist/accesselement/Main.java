package com.arraylist.accesselement;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List <Employee> employeeList=new ArrayList<>();

        employeeList.add(new Employee(101, "John", 5000.0, "Research"));
        employeeList.add(new Employee(107, "Turner", 4000.0, "Sales"));
        employeeList.add(new Employee(103, "David", 5000.0, "IT"));
        employeeList.add(new Employee(105, "Miller", 7000.0, "Research"));
        employeeList.add(new Employee(102, "Jack", 6000.0, "Accounting"));
        employeeList.add(new Employee(104, "Mary", 7500.0, "HR"));
        employeeList.add(new Employee(106, "Wilson", 5000.0, "IT"));
        employeeList.add(new Employee(108, "Emma", 5000.0, "HR"));

        //Print using foreach loop
        /*for(Employee employee:employeeList)
        {
            System.out.println(employee);
        }
*/
        //print using Iterator
       /* Iterator<Employee> iterator=employeeList.iterator();
        while (iterator.hasNext())
        {
            Employee e=iterator.next();
            System.out.println(e);
        }*/

        //Print using ListIterator
        /*ListIterator <Employee> employeeListIterator=employeeList.listIterator();
        while (employeeListIterator.hasNext())
        {
            Employee e=employeeListIterator.next();
            System.out.println(e);
        }*/

        //Print reverseOrder
        ListIterator<Employee> listIterator=employeeList.listIterator(employeeList.size());
        while (listIterator.hasPrevious())
        {
            Employee e=listIterator.previous();
            System.out.println(e);
        }

    }
}
