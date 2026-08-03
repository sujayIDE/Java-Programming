package bankingmanagementsystem;

public class SBI extends Bank {
    private double depositAmount;
    private double withdrawAmount;

    public SBI(int accountNumber, String accountHolderName, double balance, double depositAmount, double withdrawAmount) {
        super(accountNumber, accountHolderName, balance);
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    void deposit() {
        setBalance(getBalance()+depositAmount);
        System.out.println("Deposit Successful....");
        System.out.println("Balance: "+getBalance());
    }

    @Override
    void withdraw() {
        if(getBalance()>=withdrawAmount)
        {
            setBalance(getBalance()-withdrawAmount);
            System.out.println("Withdraw Successful....");
            System.out.println("Balance: "+getBalance());
        }
    }

    @Override
    void calculateInterest() {
        double total_Amount_With_Interest=(getBalance()*1*6.5)/100;
        System.out.println("TotalInterest : "+total_Amount_With_Interest);
    }
}
