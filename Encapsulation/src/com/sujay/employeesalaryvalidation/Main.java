package com.sujay.employeesalaryvalidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter empid: ");
        int empid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter empname: ");
        String empname=sc.nextLine();
        System.out.println("Enter salary: ");
        double salary=sc.nextDouble();

        Employee employee=new Employee();
        employee.setEmpId(empid);
        employee.setEmpName(empname);
        employee.setSalary(salary);

        if(employee.getSalary()>0)
        {
            System.out.println("==Employee salary==");
            System.out.println("EmpID: "+employee.getEmpId());
            System.out.println("EmpName: "+employee.getEmpName());
            System.out.println("Salary: "+employee.getSalary());
        }
    }
}
