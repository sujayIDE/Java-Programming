package com.universityportal;

public class Professor extends Employee{
    private String specialization;
    private double salary;

    public Professor(int personId,String name,int age,String gender,int employeeId,String department,String specialization,double salary)
    {
        super(personId, name, age, gender, employeeId, department);
        this.specialization=specialization;
        this.salary=salary;
    }

    @Override
    void displayDetails() {
        System.out.println("==========Professor Details=============");
        super.displayDetails();
        System.out.println("Specialization: "+specialization);
        System.out.println("salary        : "+salary);
    }
}
