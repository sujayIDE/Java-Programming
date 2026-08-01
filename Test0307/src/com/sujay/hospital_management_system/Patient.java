package com.sujay.hospital_management_system;

import java.util.Scanner;

public class Patient {
    private int patientId;
    private String patientName;
    private int age;
    private String disease;

    Scanner sc=new Scanner(System.in);
    void acceptPatientDetails(){
        System.out.println("Enter PatientID: ");
        patientId=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter PatientName: ");
        patientName=sc.nextLine();

        System.out.println("Enter Age: ");
        age=sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Disease: ");
        disease=sc.nextLine();

    }

    void displayPatientDetails(){
        System.out.println("=========Patient Details=========");
        System.out.println("PatientId: "+patientId);
        System.out.println("PatientName: "+patientName);
        System.out.println("Age: "+age);
        System.out.println("Disease: "+disease);
    }
}
