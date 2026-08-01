package com.hospitalmanagementsystem;

public class Doctor extends Person{
private String specialization;
private int experience;
private int consultationFee;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }

    void displayDoctorDetails()
    {
        super.displayPersonDetails();
        System.out.println("Specialization: "+specialization);
        System.out.println("Experience: "+experience);
        System.out.println("Consultation fee: "+consultationFee);

    }
}
