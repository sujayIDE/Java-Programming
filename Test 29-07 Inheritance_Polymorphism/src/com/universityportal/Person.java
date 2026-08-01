package com.universityportal;

public class Person {
    private int personId;
    private String name;
    private int age;
    private String gender;

    public Person(int personId,String name,int age,String gender)
    {
        this.personId=personId;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    void displayDetails()
    {
        System.out.println("Person ID    : "+personId);
        System.out.println("Person Name  : "+name);
        System.out.println("Person Age   : "+age);
        System.out.println("Person Gender: "+gender);
    }
}
