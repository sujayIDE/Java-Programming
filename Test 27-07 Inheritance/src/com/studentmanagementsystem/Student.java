package com.studentmanagementsystem;

public class Student extends Person{
    private int rollno;
    private String course;

    public Student(String name,int age,int rollno,String course)
    {
        super(name,age);
        this.rollno=rollno;
        this.course=course;
    }

    void display()
    {
        super.display();
        System.out.println("Roll no :"+rollno);
        System.out.println("Course :"+course);
    }
}
