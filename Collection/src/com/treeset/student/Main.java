package com.treeset.student;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       /* NameComparator nameComparator=new NameComparator();*/
        AddressComparator addressComparator=new AddressComparator();
        TreeSet<Student> students=new TreeSet<>(addressComparator);
        students.add(new Student(109,"Maruti","Kolhapur"));
        students.add(new Student(101,"Ajay","Latur"));
        students.add(new Student(105,"Noor","Pune"));

        for(Student student:students)
        {
            System.out.println(student);
        }
    }
}
