package bankingmanagementsystem;

public class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount....");
        }
        double totalBalance = getBalance() + amount;
        System.out.println("Deposit Successful..." + amount);
        setBalance(totalBalance);
    }

    @Override
    public void withdraw(double amount) {
        if ((getBalance() + 10000) <= amount) {
            double remaining = (getBalance() + 10000) - amount;
            setBalance(remaining);
        } else {
            throw new InsufficientBalance1000("Insufficinet funds... over draft also exceeded ");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account has no interest..");
    }
}
