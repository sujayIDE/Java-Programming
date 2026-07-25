package com.emp;
public class TestMain {
    public static void main(String[] args) {
        Employee e=new Employee(1,"Sujay",45000.0,"Developer");
        e.setSalary(85000);

        System.out.println("ID: "+e.getId());
        System.out.println("Name: "+e.getName());
        System.out.println("Salary: "+e.getSalary());
        System.out.println("Department: "+e.getDepartment());
    }
}
