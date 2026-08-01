package com.sujay.bank_employee_management_system;

import java.util.Scanner;

public class Manager extends Employee{
    private String branchName;
    private double incentive;
    private int teamSize;

    Scanner sc=new Scanner(System.in);
    void acceptManagerDetails(){
        System.out.println("Enter branch name: ");
        branchName=sc.nextLine();

        System.out.println("Enter incentive: ");
        incentive=sc.nextDouble();


    }
    void displayManagerDetails()
    {

    }
}
