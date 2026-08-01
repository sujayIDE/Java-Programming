package com.sujay.bank_employee_management_system;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String department;
    private double salary;

    Scanner sc=new Scanner(System.in);
   void acceptEmployeeDetails()
   {
       System.out.println("Enter Empid: ");
       employeeId=sc.nextInt();
       sc.nextLine();

       System.out.println("Enter EmpName: ");
       employeeName=sc.nextLine();

       System.out.println("Enter Department: ");
       department=sc.nextLine();

       System.out.println("Enter Salary: ");
       salary=sc.nextDouble();
   }

   void displayEmployeeDetails()
   {
       System.out.println("Empid: "+employeeId);
       System.out.println("EmpName: "+employeeName);
       System.out.println("Department: "+department);
       System.out.println("Salary: "+salary);
   }
}
