package practice.synchronization;

public class AccountBalance {
    private int balance=1000;

    public synchronized void withdraw(int amount)
    {
        if(balance>balance)
        {
            System.out.println("Main balance is : "+balance);
            balance-=amount;
            System.out.println("Withdraw successful...");
            System.out.println("balance after withdraw : "+balance);
        }else{
            System.out.println("Insufficient fund");
        }
    }
}
