package bankingmanagementsystem;

public abstract class Bank {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Bank(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void display()
    {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("AccountHolder Name: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }

    abstract void deposit();
    abstract void withdraw();
    abstract void calculateInterest();
}
