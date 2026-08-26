package com.set.MedicineManagementSystem;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MedicineService medicineService = new MedicineService();
        int choice=0;
        do{
            System.out.println("Menu");
            System.out.println("1.Add");
            System.out.println("2.Remove");
            System.out.println("3.Search");
            System.out.println("4.Display");
            System.out.println("5.Exit");

            System.out.println("Enter choice : ");
             choice=sc.nextInt();

            switch (choice)
            {
                case 1:
                    int count = 0;

                    while (count < 3)
                    {
                        System.out.println("Enter medicine Id : ");
                        int medicineId = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Medicine Name : ");
                        String medicineName = sc.nextLine();

                        System.out.println("Enter category : ");
                        String category = sc.nextLine();

                        System.out.println("Enter Price : ");
                        double price = sc.nextDouble();

                        boolean added = medicineService.addMedicine(
                                new Medicine(medicineId, medicineName, category, price)
                        );

                        if (added)
                        {
                            count++;
                            System.out.println("Medicine added successfully.");
                        }
                        else
                        {
                            System.out.println("Medicine ID already exists. Enter another ID.");
                        }
                    }
                    break;
                case 2:


                    break;

                case 3:
                    System.out.println("search medicine by id : ");
                    int medicineId=sc.nextInt();
                    medicineService.searchMedicine(medicineId);
                    break;

                case 4 :
                    medicineService.displayMedicine();
            }
        }while (choice!=5);

    }
}