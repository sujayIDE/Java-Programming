class Account{
    long accountNumber;
    String accountHolderName;
    double balance;

    void deposit(double amount)
    {
       if(amount>=0)
       {
           System.out.println("Amount deposited successfully:" +amount+" Rs");
           balance+=amount;
       }
    }

    void withdraw(double amount)
    {
       if(amount>=0 && balance>0)
       {
           System.out.println("Amount withdraw successfully: "+amount+" Rs");
           balance-=amount;
       }
    }

    double getBalance()
    {
        return balance;
    }
}
public class Tester {
    public static void main(String[] args) {
        Account ac1=new Account();
        ac1.accountNumber=123456L;
        ac1.accountHolderName="Turner";
        ac1.balance=5000.0;

        Account ac2=new Account();
        ac2.accountNumber=5453434L;
        ac2.accountHolderName="King";
        ac2.balance=3000.0;

        ac1.deposit(3000.0);
        ac1.withdraw(2000.0);
        System.out.println("Balance is: "+ac1.getBalance());
        System.out.println("=================================");
        ac2.deposit(1000.0);
        ac2.withdraw(2000.0);
        System.out.println("Balance is: "+ac2.getBalance());
    }
}
