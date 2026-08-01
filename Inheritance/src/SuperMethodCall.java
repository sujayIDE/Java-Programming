class Student
{
    Student(int x)
    {
        System.out.println("Parent Class Constructor....");
    }
}

class AccountStudent extends Student{
    AccountStudent()
    {
        super(10);
        System.out.println("Child class constructor.....");
    }
}
public class SuperMethodCall {
    public static void main(String[] args) {
        AccountStudent as=new AccountStudent();
    }
}
