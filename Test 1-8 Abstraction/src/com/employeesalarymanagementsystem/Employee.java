package com.employeesalarymanagementsystem;

public abstract class Employee {
    private int employeeId;
    private String empName;
    public String department;

    public Employee(int employeeId, String empName, String department) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.department = department;
    }

    void displayEmployeeDetails()
    {
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Department: "+department);
    }

    abstract double calculateSalary();
}
