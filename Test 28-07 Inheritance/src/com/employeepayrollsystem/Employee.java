package com.employeepayrollsystem;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(int employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    Scanner scanner=new Scanner(System.in);

    void readEmployeeDetails()
    {
        System.out.print("Enter Employee ID: ");
        int employeeId=scanner.nextInt();
        scanner.nextLine();
        setEmployeeId(employeeId);

        System.out.println("Enter Name: ");
        String empname=scanner.nextLine();
        setEmployeeName(empname);

        System.out.println("Enter Department: ");
        String department=scanner.nextLine();
        setDepartment(department);
    }


    void calculateSalary()
    {
        System.out.println("Salary Calculation.....");
    }

    void displayEmployeeDetails()
    {
        System.out.println("EmployeeId: "+employeeId);
        System.out.println("EmployeeName: "+employeeName);
        System.out.println("Department: "+department);
    }
}
