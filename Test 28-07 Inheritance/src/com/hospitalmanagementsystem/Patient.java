package com.hospitalmanagementsystem;

public class Patient extends Person{
    private int roomNumber;
    private int admissionDate;

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setAdmissionDate(int admissionDate) {
        this.admissionDate = admissionDate;
    }

    void displayPatientDetails()
    {
        super.displayPersonDetails();
        System.out.println("RoomNumber: "+roomNumber);
        System.out.println("Addmision Date: "+admissionDate);
    }
}
