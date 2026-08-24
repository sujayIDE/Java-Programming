package com.arraylist.employee;

import java.util.*;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary<o.salary)
        {
            return -1;
        } else if (this.salary>o.salary) {
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();
        employees.addAll(
                List.of(
                        new Employee(101,"Sujay","IT",50000),
                        new Employee(201,"Ajay","Developer",40000),
                        new Employee(301,"Rohit","HR",45000)
                )
        );

        System.out.println("Display all employees.>>");
        for(Employee e:employees)
        {
            System.out.println(e);
        }

        System.out.println("===============================================================");
        System.out.println("Search an employee by id >>");
        boolean found=false;
        for(Employee e:employees)
        {
            if(e.id==101)
            {
                System.out.println(e);
                found=true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("Employee not found...");
        }

        System.out.println("======================================");
        System.out.println("Remove an employee by id.>>");
        //using foreach
        boolean flag=false;
        for(Employee e:employees)
        {
            if(e.id==201)
            {
                employees.remove(e);
                System.out.println("Employee remove successfully....");
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Employee is not found....");
        }

        //using Iterator()
        boolean flag1=false;
        Iterator<Employee> iterator=employees.iterator();
        while (iterator.hasNext())
        {
            Employee e=iterator.next();
            if(e.id==201)
            {
                iterator.remove();
                System.out.println("Employee remove successfully...");
                flag1=true;
                break;
            }
        }
        if(!flag1)
        {
            System.out.println("Employee not found");
        }

        System.out.println("================================================");
        System.out.println("Sort Employee by salary...");
        employees.sort(null);
        for(Employee e:employees)
        {
            System.out.println(e);
        }

        System.out.println("==================================================");
        System.out.println("Whenever a new employee is added, also add that employee to the LinkedList.");
        List<Employee> employeeLinkedList=new LinkedList<>();
        List<Employee> newEmployees = List.of(
                new Employee(401, "Maruti", "HR", 30000),
                new Employee(402, "Amit", "IT", 40000),
                new Employee(403, "Rahul", "Developer", 45000)
        );

        employees.addAll(newEmployees);
        employeeLinkedList.addAll(newEmployees);

       ListIterator<Employee> employeeIterator=employeeLinkedList.listIterator(employeeLinkedList.size());
       while (employeeIterator.hasPrevious())
       {
           Employee e=employeeIterator.previous();
           System.out.println(e);
       }
    }

}
