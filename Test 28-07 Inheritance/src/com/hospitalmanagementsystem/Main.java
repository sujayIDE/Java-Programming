package com.hospitalmanagementsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("List Of Hospital Member: ");
        System.out.println("1.Doctor");
        System.out.println("2.Nurse");
        System.out.println("3.Patient");

        System.out.println("Enter type: ");
        int choice= scanner.nextInt();

        switch (choice)
        {
            case 1:
                Doctor doctor=new Doctor();
                doctor.readPersonDetails();
                System.out.println("Enter Specialization: ");
                String specialization=scanner.nextLine();
                scanner.nextLine();
                doctor.setSpecialization(specialization);

                System.out.println("Enter Experience: ");
                int experience=scanner.nextInt();
                doctor.setExperience(experience);

                System.out.println("Enter Consultation fee: ");
                int fee= scanner.nextInt();
                doctor.setConsultationFee(fee);

                doctor.displayDoctorDetails();
                break;

            case 2:
                Nurse nurse=new Nurse();
                nurse.readPersonDetails();

                System.out.println("Enter department: ");
                String department=scanner.nextLine();
                scanner.nextLine();
                nurse.setDepartment(department);

                System.out.println("Enter Shift: ");
                String shift=scanner.nextLine();
                nurse.setShift(shift);

                System.out.println("Enter YearsOfExperience: ");
                int expereience=scanner.nextInt();
                nurse.setYearsOfExprerience(expereience);

                nurse.displayNurseDetails();
                break;

            case 3:
                Patient patient=new Patient();
                patient.readPersonDetails();
                System.out.println("Enter Room Number: ");
                int no=scanner.nextInt();
                scanner.nextLine();
                patient.setRoomNumber(no);

                System.out.println("Enter admissiondate: ");
                int date=scanner.nextInt();
                patient.setAdmissionDate(date);

                patient.displayPatientDetails();


        }
    }
}
