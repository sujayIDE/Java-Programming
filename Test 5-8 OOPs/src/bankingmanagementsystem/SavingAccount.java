package bankingmanagementsystem;

public class SavingAccount extends Account {
    private double interestRate=5.0;

    public SavingAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void deposit(double amount) {
        if(amount<=0) {
            throw new InvalidAmountException("Invalid amount....");
        }
        double totalBalance=getBalance()+amount;
        setBalance(totalBalance);
        System.out.println("Deposit Successful...."+amount);
    }

    @Override
    public void withdraw(double amount) {
       if(amount>getBalance())
       {
           throw new InsufficientBalance1000("Insufficient balance...");
       }
       if(amount<=0)
       {
           throw new InvalidAmountException("Invalid Amount...."+amount);
       }
        double balanceAfterWithdraw=getBalance()-amount;
        System.out.println("Amount withdraw Successful... "+amount);
        if(balanceAfterWithdraw<1000)
        {
            throw new InsufficientBalance1000("Balance is less than 1000");
        }
        setBalance(balanceAfterWithdraw);
    }

    @Override
    public void calculateInterest() {
        double interest=(getBalance()*1*interestRate)/100;
        System.out.println("Saving Interest : "+interest);
    }
}
