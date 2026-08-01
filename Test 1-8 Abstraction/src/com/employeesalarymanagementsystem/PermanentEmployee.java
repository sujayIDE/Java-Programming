package com.employeesalarymanagementsystem;

public class PermanentEmployee extends Employee{
    private double basicSalary;
    private double hra;
    private double bonus;

    public PermanentEmployee(int employeeId, String empName, String department, double basicSalary, double hra, double bonus) {
        super(employeeId, empName, department);
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        double totalSalary=basicSalary+hra+bonus;
        return totalSalary;
    }

    @Override
    void displayEmployeeDetails() {
        System.out.println("Employee Type:  Permanent");
        super.displayEmployeeDetails();
        System.out.println("Basic Salary : "+basicSalary);
        System.out.println("HRA          : "+hra);
        System.out.println("Bonus        : "+bonus);
        System.out.println("Total Salary : "+calculateSalary());
    }
}
