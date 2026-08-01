package com.universityportal;

public class Student extends Person {
    private int rollno;
    private String course;

    public Student(int personId,String name,int age,String gender,int rollno,String course)
    {
        super(personId,name,age,gender);
        this.rollno=rollno;
        this.course=course;
    }

    @Override
    void displayDetails() {
        System.out.println("===========Student Details============");
        super.displayDetails();
        System.out.println("Roll No   : "+rollno);
        System.out.println("Course    : "+course);
    }
}
