package com.employeepayrollsystem;

public class FullTimeEmployee extends Employee{
    private double basicSalary;
    private double houseRentAllowance;
    private double medicalAllowance;

    public FullTimeEmployee(int employeeId, String employeeName, String department, double basicSalary, double houseRentAllowance, double medicalAllowance) {
        super(employeeId, employeeName, department);
        this.basicSalary = basicSalary;
        this.houseRentAllowance = houseRentAllowance;
        this.medicalAllowance = medicalAllowance;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setHouseRentAllowance(double houseRentAllowance) {
        this.houseRentAllowance = houseRentAllowance;
    }

    public void setMedicalAllowance(double medicalAllowance) {
        this.medicalAllowance = medicalAllowance;
    }

    @Override
    void calculateSalary()
    {
        System.out.println("Enter Basic Salary: ");
        double basicsalary=scanner.nextDouble();
        setBasicSalary(basicsalary);

        System.out.println("Enter HouseRentAllowance: ");
        double houseRentAllowance= scanner.nextDouble();
        setHouseRentAllowance(houseRentAllowance);

        System.out.println("Enter MedicalAllowance: ");
        double meidcalAllowance=scanner.nextDouble();
        setMedicalAllowance(meidcalAllowance);

        System.out.println();
        double totalSalary=basicSalary+houseRentAllowance+medicalAllowance;
        System.out.println("FullTime Employee total monthly salary: "+totalSalary);
    }
}
