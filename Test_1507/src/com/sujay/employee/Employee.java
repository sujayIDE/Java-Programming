package com.sujay.employee;

import java.util.Scanner;

public class Employee {
    private int empId;
    private String empName;
    private double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void validateSalary(double amount)
    {
        if(salary<15000)
        {
            throw new InvalidSalaryException("Invalid salary");
        }

        if(salary>=15000)
        {
            System.out.println("Employee ID: "+empId);
            System.out.println("Employee Name: "+empName);
            System.out.println("Employee Salary: "+salary);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter EmpID: ");
        int empid=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Empname: ");
        String empname=sc.nextLine();

        System.out.println("Enter Salary: ");
        double salary=sc.nextDouble();

        Employee employee=new Employee(empid,empname,salary);

        try{
            employee.validateSalary(salary);
        }catch (InvalidSalaryException e){
            System.out.println(e);
        }finally {
            System.out.println("Process Completed....");
        }

    }
}
