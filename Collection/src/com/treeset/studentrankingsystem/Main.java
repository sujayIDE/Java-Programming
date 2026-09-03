package com.treeset.studentrankingsystem;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students=new TreeSet<>();
        students.add(new Student(101,"Ajay",98.0));
        students.add(new Student(102,"Vijay",88.0));
        students.add(new Student(103,"Rajesh",78.90));
        students.add(new Student(104,"Kumar",92.0));
        students.add(new Student(105,"John",90.0));
        students.add(new Student(106,"Virat",82.0));

        //display student
        for(Student student:students)
        {
            System.out.println(student);
        }

        System.out.println();
        //descending order
        for(Student student:students.descendingSet())
        {
            System.out.println(student);
        }

        System.out.println();
        //ascending
        for(Student student:students)
        {
            System.out.println(student);
        }

        System.out.println();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student id for search : ");
        int id=sc.nextInt();
        //search using product id
        for(Student student:students)
        {
            if(student.getStudent_id()==id)
            {
                System.out.println(student);
            }
        }

        System.out.println();
        System.out.println("Remove student enter student id : ");
        int delid=sc.nextInt();
        boolean flag=false;
        Iterator<Student> studentIterator=students.iterator();
        while (studentIterator.hasNext())
        {
            Student student=studentIterator.next();
            if(student.getStudent_id()==delid)
            {
                studentIterator.remove();
                System.out.println("Remove");
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Student not found...");
        }


        System.out.println();
        //total unique element
        System.out.println(students.size());
    }

}
