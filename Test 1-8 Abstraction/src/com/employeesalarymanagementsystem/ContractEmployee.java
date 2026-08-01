package com.employeesalarymanagementsystem;

public class ContractEmployee extends Employee{
    private int hourWorked;
    private int hourlyRate;

    public ContractEmployee(int employeeId, String empName, String department, int hourWorked, int hourlyRate) {
        super(employeeId, empName, department);
        this.hourWorked = hourWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        double totalSalary=hourWorked*hourlyRate;
        return totalSalary;
    }

    @Override
    void displayEmployeeDetails() {
        System.out.println("Employee Type:  ContractBased");
        super.displayEmployeeDetails();
        System.out.println("Hours Worked : "+hourWorked);
        System.out.println("Hours Rate   : "+hourlyRate);
        System.out.println("Total Salary : "+calculateSalary());
    }
}
