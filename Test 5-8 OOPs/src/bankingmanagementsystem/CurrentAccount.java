package bankingmanagementsystem;

public class CurrentAccount extends Account{
    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void deposit(double amount) {
        if(amount<=0)
        {
            throw new InvalidAmountException("Invalid amount....");
        }
        double totalBalance=getBalance()+amount;
        System.out.println("Deposit Successful..."+amount);
        setBalance(totalBalance);
    }

    @Override
    public void withdraw(double amount) {
        double remaining = getBalance() - amount;

        if(remaining < -10000)
        {
            throw new Overdraft("Overdraft limit exceeded.");
        }

        setBalance(remaining);
    }

    @Override
    public void calculateInterest() {
        double interest=(getBalance()*1*8.5)/100;
        System.out.println("Current Account Interest : "+interest);
    }
}
