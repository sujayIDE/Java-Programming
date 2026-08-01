import java.util.Scanner;

public class AtmBAnkAccountSimulator {
    public static void main(String[] args) {
        int account_balance=10000;
//        int deposit_amount;
//        int withdraw_amount;
        System.out.println("===Menu===");
        System.out.println("1.Deposit");
        System.out.println("2.withdraw");
        System.out.println("3.Balance Enquiry");
        System.out.println("4.Exit");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choice: ");
        int choice=sc.nextInt();

        int updated_accountBalance=account_balance;
        String description;
        switch (choice)
        {
            case 1:
                System.out.println("===Deposit===");
                System.out.println("Enter deposit amount");
                int deposit_amount=sc.nextInt();
               if(deposit_amount>0)
               {
                   updated_accountBalance+=deposit_amount;
                   System.out.println("Enter Description");
                   description=sc.next();
                   System.out.println("Trasaction description:"+description+" "+"Updated Accountbalance: "+updated_accountBalance);
               }else
               {
                   System.out.println("\"Transaction Failed: Deposit amount must be greater than zero.");
                   System.out.println("AccountBalance: "+account_balance);
               }
               break;

            case 2:
                System.out.println("===Withdraw===");
                System.out.println("Enter withdraw amount: ");
                int withdraw_amount=sc.nextInt();
                if(withdraw_amount<0)
                {
                    System.out.println("Print an error message: \"Transaction Failed: Withdrawal amount must be greater than zero.\"");
                } else if (withdraw_amount>updated_accountBalance) {
                    System.out.println("\"Transaction Failed: Insufficient balance.\"");
                }else {
                    updated_accountBalance-=withdraw_amount;
                    System.out.println("Enter Description");
                    description=sc.next();
                    System.out.println("Trasaction description:"+description+" "+"Updated Accountbalance: "+updated_accountBalance);
                }
                break;

            case 3:
                System.out.println("Current account balance: "+updated_accountBalance);
                break;

            case 4:
                System.out.println("Thank you for using the ATM. Have a great day!");
                break;

        }
    }
}
