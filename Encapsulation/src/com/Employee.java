package com;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private int accessCode;
    private boolean active;
    static int totalEmployees;

    static {
        totalEmployees=1000;
    }

    {
        accessCode=0;
    }

    public Employee(int employeeId, int accessCode, boolean active) {
        this.employeeId = employeeId;
        this.accessCode = accessCode;
        this.active = active;
    }

    boolean checkAccess(int requirePermission)
    {
        boolean isAdmin=(accessCode & (1<<3))!=0;
        int requiredMask=1<<requirePermission;
        boolean hasRequiredPermission=(accessCode & requiredMask)!=0;
        return active && (isAdmin || hasRequiredPermission);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getAccessCode() {
        return accessCode;
    }

    public boolean isActive() {
        return active;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();

        System.out.print("Enter Access Code: ");
        int accessCode = sc.nextInt();

        System.out.print("Enter Active status: ");
        boolean active = sc.nextBoolean();

        System.out.print("Enter Required Permission: ");
        int requiredPermission = sc.nextInt();

        Employee employee =
                new Employee(employeeId, accessCode, active);

        boolean result =
                employee.checkAccess(requiredPermission);

        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Active: " + employee.isActive());
        System.out.println("Access Code: " + employee.getAccessCode());
        System.out.println("Access Granted: " + result);

        sc.close();


    }
}
