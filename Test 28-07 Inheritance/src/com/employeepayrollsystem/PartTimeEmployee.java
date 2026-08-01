package com.employeepayrollsystem;

public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private int hourlyRate;

    public PartTimeEmployee(int employeeId, String employeeName, String department, int hoursWorked, int hourlyRate) {
        super(employeeId, employeeName, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    void calculateSalary() {
        System.out.println("Enter HoursWorked: ");
        int hoursworked=scanner.nextInt();
        scanner.nextLine();
        setHoursWorked(hoursworked);

        System.out.println("Enter HourlyRate: ");
        int hourRate=scanner.nextInt();
        setHourlyRate(hourRate);

        int totalSalary=hoursWorked*hourlyRate;
        System.out.println("PartTime Employee Total salary: "+totalSalary);
    }
}
