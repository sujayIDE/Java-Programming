package com.sujay.hospital_management_system;

import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Employee {

    private String specialization;
    private double consultationFee;
    ArrayList<Patient> patients = new ArrayList<>();

    void acceptDoctorDetails() {
        Scanner sc = new Scanner(System.in);

        super.acceptEmployeeDetails();

        System.out.println("Enter Specialization: ");
        specialization = sc.nextLine();

        System.out.println("Enter Consultation Fee: ");
        consultationFee = sc.nextDouble();
    }

    void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully...");
    }

    void displayPatients() {
        for (Patient p : patients) {
            p.displayPatientDetails();
        }
    }

    void displayDoctorDetails() {
        super.displayEmployeeDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: " + consultationFee);
    }
}