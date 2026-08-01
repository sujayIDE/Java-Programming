package com.arrayClassProblem.studentperformancesystem;

public class Main {
    public static void main(String[] args) {
        int[] marks=new int[5];
        marks[0]=95;
        marks[1]=88;
        marks[2]=92;
        marks[3]=84;
        marks[4]=90;
        Student student=new Student(101,"Rohit",marks);
        student.calculateTotal();
        student.calculateAverage();
        student.display();

    }
}
