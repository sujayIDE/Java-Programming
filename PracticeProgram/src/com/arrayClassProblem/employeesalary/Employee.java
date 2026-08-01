package com.arrayClassProblem.employeesalary;

public class Employee {
    int empid;
    String empname;
    double salary;

    public Employee(int empid,String empname,double salary)
    {
        this.empid=empid;
        this.empname=empname;
        this.salary=salary;
    }

    void display()
    {
        if(salary>40000.0)
        {
            System.out.println("Emp Id: "+empid);
            System.out.println("Emp Name: "+empname);
            System.out.println("Salary :"+salary);
        }
    }

    public static void main(String[] args) {
        Employee [] employee=new Employee[5];
        employee[0]=new Employee(101,"Rohit",60000.0);
        employee[1]=new Employee(102,"Ajay",30000.0);
        employee[2]=new Employee(103,"Noor",45000.0);
        employee[3]=new Employee(104,"Maruti",25000.0);
        employee[4]=new Employee(105,"Rakesh",34000.0);

        for(Employee employee1:employee)
        {
            employee1.display();
        }
    }
}
