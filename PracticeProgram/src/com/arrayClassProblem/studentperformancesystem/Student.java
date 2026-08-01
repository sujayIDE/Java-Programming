package com.arrayClassProblem.studentperformancesystem;

public class Student {
    private int rollno;
    private String name;
    private int[] marks;

    public Student(int rollno, String name, int[] marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    int calculateTotal()
    {
        int total=0;
        for(int i=0;i<marks.length;i++)
        {
            total+=marks[i];
        }
        return total;
    }

    double calculateAverage()
    {
        double sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum+=marks[i];
        }
        double average = sum / marks.length;
       return average;
    }
    
    void assignGrade()
    {
        double average=0.0;
        average=calculateAverage();

        if(average>=90)
        {
            System.out.println("Grade A+");
        } else if (average<90 && average>=75) {
            System.out.println("Grade A");
        } else if (average<75 && average>=60 ) {
            System.out.println("Grade B");
        } else if (average<60 && average>=50) {
            System.out.println("Grade C");
        }else {
            System.out.println("Fail");
        }
    }

    void display()
    {
        System.out.println("Roll no: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Total :"+calculateTotal());
        System.out.println("Average :"+calculateAverage());
        assignGrade();
    }
}
