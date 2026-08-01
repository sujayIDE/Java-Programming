package com.hospitalmanagementsystem;

public class Nurse extends Person{
    private String department;
    private String shift;
    private int yearsOfExprerience;

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setYearsOfExprerience(int yearsOfExprerience) {
        this.yearsOfExprerience = yearsOfExprerience;
    }

    void displayNurseDetails()
    {
        super.displayPersonDetails();
        System.out.println("Department: "+department);
        System.out.println("Shift: "+shift);
        System.out.println("YearOfExperience: "+yearsOfExprerience);
    }
}
