package com.arraylist.employeeattendance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeAttendanceSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        //-> Add employees to the ArrayList.
        System.out.println("Add employees to the ArrayList");
        int totalEmployeeNumbers=5;
       for(int i=1;i<=totalEmployeeNumbers;i++)
        {
            System.out.println("Enter empId : ");
            int empId=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter empName : ");
            String empName=sc.nextLine();

            System.out.println("Enter Department : ");
            String department=sc.nextLine();

            System.out.println("Enter 5 weeks attendance : ");
            int[] attendance=new int[5];

            for(int j=0;j<attendance.length;j++)
            {
                int value=sc.nextInt();
                if(attendance[j]>=0 && attendance[j]<=5)
                {
                   attendance[j]=value;
                }else
                {
                    throw new ValidAttendance("Attendance must be between 0 and 5 for each week");
                }
                sc.nextLine();
            }

            employees.add(new Employee(empId,empName,department,attendance));

        }

        System.out.println("======================================================================================");
       //-> Display all employee details.
        System.out.println("-> Display all employee details.");
       for(Employee e:employees)
       {
           System.out.println(e);
       }

        System.out.println("=======================================================================================");
       //Calculate the total attendance of each employee using the attendance array.
        System.out.println("Calculate the total attendance of each employee using the attendance array.");
       for(Employee e:employees)
       {
           int totalAttendance=0;
           for(int attend:e.getAttendance())
           {
               totalAttendance+=attend;
           }
           System.out.println("Total Attendance of -->"+e.getEmployeeName()+" is "+totalAttendance);
       }

        System.out.println("===========================================================================================");
       //Calculate the average attendance
        System.out.println("Calculate the average attendance");
        for(Employee e:employees)
        {
            int totalAttendanceEachEmployee=0;
            for(int attend:e.getAttendance())
            {
                totalAttendanceEachEmployee+=attend;
            }
            int avg=totalAttendanceEachEmployee/5;
            System.out.println("Average of --> "+e.getEmployeeName()+" is "+avg);
        }

        System.out.println("=========================================================");
        // Display employees whose average attendance is 90% or above
        System.out.println(" Display employees whose average attendance is 90% or above");
        for(Employee e:employees)
        {
            int totalAttendanceEachEmployee=0;
            for(int attend:e.getAttendance())
            {
                totalAttendanceEachEmployee+=attend;
            }
            double percentage= (double) (totalAttendanceEachEmployee * 100) /25;
           if(percentage>=90)
           {
               for(Employee e1:employees)
               {
                   System.out.println(e1);
               }
           }
        }

        System.out.println("=========================================================");
        //Search for an employee by name using contains() or String processing.
        System.out.println("Search for an employee by name using contains() or String processing.");
        System.out.println("Enter Name to search");
        String searchName=sc.nextLine();
        for(Employee e:employees)
        {
            if(e.getEmployeeName().contains(searchName))
            {
                System.out.println(e);
            }
        }

        System.out.println("=============================================================");
        //Convert employee names to uppercase before displaying them.
        System.out.println("Convert employee names to uppercase before displaying them.");
        for(Employee e:employees)
        {
            String upperCase = e.getEmployeeName().toUpperCase();
            System.out.println(upperCase);
        }

        System.out.println("=========================================================================");
        //Remove an employee using remove().
        System.out.println("Remove an employee using remove().");
        System.out.println("Enter Name to remove employee : ");

        String name = sc.nextLine();

        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext())
        {
            Employee e = iterator.next();

            if (e.getEmployeeName().contains(name))
            {
                System.out.println("Removed: " + e);
                iterator.remove();
            }
        }
    }

}
