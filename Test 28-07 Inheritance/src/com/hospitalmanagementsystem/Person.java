package com.hospitalmanagementsystem;

import java.util.Scanner;

public class Person {
private int personId;
private String personName;
private int age;
private String gender;

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    Scanner sc=new Scanner(System.in);

    void readPersonDetails()
    {
        System.out.println("Enter PersonId: ");
        int personid=sc.nextInt();
        sc.nextLine();
        setPersonId(personid);

        System.out.println("Enter Person Name: ");
        String name=sc.nextLine();
        setPersonName(name);

        System.out.println("Enter age: ");
        int age=sc.nextInt();
        sc.nextLine();
        setAge(age);

        System.out.println("Enter Gender: ");
        String gender=sc.nextLine();
        setGender(gender);
    }

    void displayPersonDetails(){
        System.out.println("Person Id: "+personId);
        System.out.println("Person Name: "+personName);
        System.out.println("Person Age: "+age);
        System.out.println("Person Gender: "+gender);
    }
}
