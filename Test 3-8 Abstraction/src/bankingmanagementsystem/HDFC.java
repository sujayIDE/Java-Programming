package bankingmanagementsystem;

public class HDFC extends Bank{
   private double depositAmount;
   private double withdrawAmount;

    public HDFC(int accountNumber, String accountHolderName, double balance, double depositAmount, double withdrawAmount) {
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
        double total_Amount_With_Interest=(getBalance()*1*7.8)/100;
        System.out.println("TotalAmountWithInterest : "+total_Amount_With_Interest );
    }
}
