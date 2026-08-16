package com.smartelectricitymeter;

import java.util.Scanner;

public class ElectricityMeter {
    private int previousReading;
    private int currentReading;
    private boolean connectionActive;
    static int meterCount;

    static{
        meterCount=0;
    }

    {
        currentReading=0;
    }

    public ElectricityMeter(int previousReading, int currentReading, boolean connectionActive) {
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionActive = connectionActive;
    }

    int unit=0;
    void calculateUnit()
    {
        unit=previousReading-currentReading;
        System.out.println("Unit : "+unit);
    }

    void checkAlert(int allowedLimit)
    {
        if(connectionActive==true && unit>allowedLimit )|| f
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Previous Reading : ");
        int previousReading=sc.nextInt();

        System.out.println("Enter Current Reading : ");
        int currentReading=sc.nextInt();

        System.out.println("Enter Connection Active : ");
        String connectionActive=sc.nextLine();

        System.out.println("Enter Status Code : ");
        int statusCode=sc.nextInt();

        System.out.println("Allowed Limit : ");
        int allowedLimit=sc.nextInt();

        ElectricityMeter electricityMeter=new ElectricityMeter();
        System.out.println();
    }
}
