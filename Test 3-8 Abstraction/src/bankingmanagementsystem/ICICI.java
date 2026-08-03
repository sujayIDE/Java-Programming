package bankingmanagementsystem;

public class ICICI extends Bank{
    private double depositAmount;
    private double withdrawAmount;

    public ICICI(int accountNumber, String accountHolderName, double balance, double depositAmount, double withdrawAmount) {
        super(accountNumber, accountHolderName, balance);
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    void deposit() {
        setBalance(getBalance()+depositAmount);
        System.out.println("Deposit Successful...");
        System.out.println("Balance: "+getBalance());
    }

    @Override
    void withdraw() {
        setBalance(getBalance()-withdrawAmount);
        System.out.println("Withdraw Successful...");
        System.out.println("Balance: "+getBalance());
    }

    @Override
    void calculateInterest() {
        double total_amount_with_interest=(getBalance()*1*6.8)/100;
        System.out.println("Total_Amount_with_Interest: "+total_amount_with_interest);
    }
}
