package com.sujay.hospital_management_system;

import java.util.Scanner;

public class Hospital_Management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of doctors: ");
        int no_doctors = sc.nextInt();

        Hospital h = new Hospital();

        for (int i = 1; i <= no_doctors; i++) {
            System.out.println("======Doctor Details======");
            Doctor doctor = new Doctor();
            doctor.acceptDoctorDetails();
            h.addDoctor(doctor);
        }

        System.out.println("Enter number of patients: ");
        int no_patient = sc.nextInt();

        for (int i = 1; i <= no_patient; i++) {
            System.out.println("======Patient Details======");
            Patient patient = new Patient();
            patient.acceptPatientDetails();
        }

        System.out.println("Enter Doctor ID to search: ");
        int doctor_search = sc.nextInt();

          h.searchDoctor(doctor_search);

        sc.close();
    }
}