import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Salary:");
        int sal=sc.nextInt();
        System.out.println("Enter Experience:");
        int exp=sc.nextInt();
        System.out.println("Enter Rating:");
        int rating=sc.nextInt();

        if(sal>5000 && exp>5 && rating>4)
        {
            int bonus=(sal*20)/100;
            System.out.println("Bonus: "+bonus);
        }
        else {
            int bonus=(sal*10)/100;
            System.out.println("Bonus: "+bonus);
        }
    }
}
