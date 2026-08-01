package com.universityportal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Person ID: ");
        int personId=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Person Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Age: ");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender=sc.nextLine();

        System.out.print("Person Type: ");
        System.out.println("1.Professor");
        System.out.println("2.Student");

        System.out.print("Enter Choice: ");
        int choice=sc.nextInt();
        sc.nextLine();

        switch (choice)
        {
            case 1:
                System.out.print("Enter Employee Id: ");
                int employeeId=sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Department: ");
                String department=sc.nextLine();

                System.out.print("Enter Specialization: ");
                String specialization=sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary=sc.nextDouble();

                Professor professor = new Professor(personId, name, age, gender, employeeId, department, specialization, salary);
                professor.displayDetails();

                break;

            case 2:
                System.out.print("Enter Rollno: ");
                int rollno=sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Course: ");
                String course=sc.nextLine();

                Student student=new Student(personId,name,age,gender,rollno,course);

                System.out.print("Student type: ");
                System.out.println("1.Normal Student: ");
                System.out.println("1.Research Student: ");
                System.out.print("Enter choice : ");
                int choice1=sc.nextInt();
                sc.nextLine();

                switch (choice1)
                {
                    case 1:
                        student.displayDetails();
                        break;

                    case 2:
                        System.out.print("Enter Research Topic: ");
                        String topic=sc.nextLine();

                        System.out.print("Enter GuideName: ");
                        String guideName=sc.nextLine();

                        ResearchStudent researchStudent=new ResearchStudent(personId,name,age,gender,rollno,course,topic,guideName);
                        researchStudent.displayDetails();

                        break;
                }

            default:
                System.out.print("Enter valid choice");
        }
    }
}
