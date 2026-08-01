abstract class Employee
{
    Employee()
    {
        System.out.print("Employee ");
    }
}

class Manager extends Employee
{
    Manager()
    {
        System.out.print("Manager");
    }
}

public class Test3
{
    public static void main(String[] args)
    {
        new Manager();
    }
}