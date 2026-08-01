package com.employeepayrollsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Employee type:");
        System.out.println("1.Full-Time Employee");
        System.out.println("2.Part-Time Employee");

        System.out.println("Enter Choice: ");
        int choice=scanner.nextInt();

        switch (choice)
        {
            case 1:
                FullTimeEmployee fullTimeEmployee=new FullTimeEmployee(0,null,null,0.0,0.0,0.0);
                fullTimeEmployee.readEmployeeDetails();
                fullTimeEmployee.displayEmployeeDetails();
                fullTimeEmployee.calculateSalary();
                break;

            case 2:
                PartTimeEmployee partTimeEmployee=new PartTimeEmployee(0,null,null,0,0);
                partTimeEmployee.readEmployeeDetails();
                partTimeEmployee.displayEmployeeDetails();;
                partTimeEmployee.calculateSalary();
        }
    }
}
