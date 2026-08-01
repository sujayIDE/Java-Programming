import java.util.Scanner;

public class BalanceAndWithdrawAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance: ");
        int balance = sc.nextInt();
        System.out.println("Enter WithdrawAmount: ");
        int withdrawAmount = sc.nextInt();
        int daily_limit = 10000;

        if (withdrawAmount > balance) {
            if (withdrawAmount / 100 != 0) {
                if (withdrawAmount > daily_limit) {
                    System.out.println("Reject");
                }
            }
        }else
        {
            balance-=withdrawAmount;
            System.out.println("balance: "+balance);
        }
    }
}