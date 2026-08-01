package com.sujay.employeesalaryvalidation;

public class Employee {
    private int empId;
    private String empName;
    private double salary;

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
       if(salary<0)
       {
           System.out.println("Enter valid salary");
       }
       else {
           this.salary = salary;
       }
    }
}
