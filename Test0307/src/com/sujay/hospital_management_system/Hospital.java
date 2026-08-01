package com.sujay.hospital_management_system;

import java.util.ArrayList;

public class Hospital {
    ArrayList<Doctor> doctors=new ArrayList<>();

    void addDoctor(Doctor doctor){
        doctors.add(doctor);
        System.out.println("Doctor added successfully...");
    }

    void displayDoctors(){
       for(Doctor doctor:doctors)
       {
           doctor.displayDoctorDetails();
           System.out.println("=========================");
       }
    }

    void searchDoctor(int employeeId) {
        int id = employeeId;

        for (Doctor doctor : doctors) {
            if (doctor.getEmployeeId() == id) {
                doctor.displayDoctorDetails();
            }
        }

    }
}


