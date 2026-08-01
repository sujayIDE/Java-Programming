package com.employeesalarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee=new PermanentEmployee(101,"Rohit","Developer",40000.0,3000.0,10000.0);
        ContractEmployee contractEmployee=new ContractEmployee(201,"Ajay","IT",10,700);

        Employee[] employees=
                {permanentEmployee,contractEmployee};

        for(Employee e:employees)
        {
            e.calculateSalary();
            e.displayEmployeeDetails();
            System.out.println("==============================================");
        }
    }
}
