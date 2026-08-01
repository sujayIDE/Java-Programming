package com.universityportal;

public class Employee extends Person{
    private int employeeId;
    private String department;

    public Employee(int personId,String name,int age,String gender,int employeeId,String department)
    {
        super(personId,name,age,gender);
        this.employeeId=employeeId;
        this.department=department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Department  : "+department);
    }
}
