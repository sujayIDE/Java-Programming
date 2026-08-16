package atmmachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int correctPin=1234;
        System.out.println("Enter Your PIN : ");
        int pin=sc.nextInt();

        if (pin != correctPin)
        {
            System.out.println("Incorrect PIN");
            return;
        }

        Atm atm=new Atm(10000,pin);
        while (true)
        {
            System.out.println("-----ATM MENU------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Mini Statement");
            System.out.println("6. Exit");

            System.out.println("Enter choice : ");
            int choice=sc.nextInt();

            switch (choice)
            {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.println("Enter Deposit Amount : ");
                    double depositAmount=sc.nextDouble();
                    try{
                        atm.deposit(depositAmount);
                    }catch (InvalidAmount e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Enter Withdraw Amount : ");
                    double withdrawAmount=sc.nextDouble();
                    try
                    {
                        atm.withdraw(withdrawAmount);
                    }catch (InsufficientBalance | InvalidAmount | MinimumBalance e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    atm.changePin();
                    break;

                case 5:
                    atm.miniStatement();
                    break;

                case 6:
                    atm.exit();
                    break;

                default:
                    System.out.println("Enter Valid Choice....");
            }
        }
    }
}
