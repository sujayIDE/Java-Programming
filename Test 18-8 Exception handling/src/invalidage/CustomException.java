package invalidage;

import java.util.Scanner;

public class CustomException {
    static void invalidAge(int age)
    {
        if(age<18)
        {
            throw new InvalidAgeException("Age must be 18 or zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age : ");
        int age=sc.nextInt();
        try{
            CustomException.invalidAge(age);
        }catch (InvalidAgeException e)
        {
            System.out.println( e.getMessage());
        }
    }
}
