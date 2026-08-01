package com.sujay.studentinformationsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student student=new Student();
        System.out.println("Enter Student ID: ");
        int stdid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name: ");
        String stdname=sc.nextLine();
        System.out.println("Enter Studnet Marks: ");
        int marks=sc.nextInt();

        student.setId(stdid);
        student.setName(stdname);
        if(marks>=0 && marks<=100)
        {
            student.setMarks(marks);
        }else {
            System.err.println("Enter valid marks...");
            return;
        }

        System.out.println("===Student Management System===");
        System.out.println("Student ID: "+student.getId());
        System.out.println("Stundet Name: "+student.getName());
        System.out.println("Student Marks: "+student.getMarks());
    }
}
