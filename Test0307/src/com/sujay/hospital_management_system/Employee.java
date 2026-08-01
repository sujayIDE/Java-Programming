package com.sujay.hospital_management_system;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String department;
    private double basicSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    void acceptEmployeeDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter EmpID: ");
        employeeId=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter EmpName: ");
         employeeName=sc.nextLine();

        System.out.println("Enter Department: ");
         department=sc.nextLine();

        System.out.println("Enter BasicSalary: ");
         basicSalary=sc.nextDouble();
    }

    void displayEmployeeDetails()
    {
        System.out.println("EmpId: "+employeeId);
        System.out.println("EmpName: "+employeeName);
        System.out.println("Department: "+department);
        System.out.println("Basic_Salary: "+basicSalary);
    }

}
