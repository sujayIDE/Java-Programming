package nonstaticinnerclass.companyemployee;

public class Company {
    String companyName="TCS";

     class Employee{
        void display()
        {
            System.out.println("Company Name : "+companyName);
            System.out.println("Employee joined");
        }
    }
}
