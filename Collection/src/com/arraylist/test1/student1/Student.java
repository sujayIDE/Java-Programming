package com.arraylist.test1.student1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> students=new ArrayList<>();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Enter Student "+i);
            students.add(sc.nextLine());
        }
        System.out.println();
        for(String names:students)
        {
            System.out.print(names+" ");
        }
    }
}
