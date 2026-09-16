package com.arraylist.student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        List<String> student=new ArrayList<>();
        student.add("Sujay");
        student.add("Ajay");
        student.add("Pratik");
        student.add("Rohit");
        student.add("Mayur");

        for(String s:student)
        {
            System.out.println(s);
        }
        System.out.println();

        student.add(2,"Tejas");

        for(String s:student)
        {
            System.out.println(s);
        }
        System.out.println();

        student.remove(2);

        for(String s:student)
        {
            System.out.println(s);
        }
        System.out.println();

        boolean flag=false;
        for(String s:student)
        {
            if(s.equalsIgnoreCase("Pratik"))
            {
                System.out.println("Found");
                flag=true;
                break;
            }
            if(flag)
            {
                System.out.println("Not found");
            }
        }

        System.out.println();

        System.out.println(student.get(3));
    }
}
