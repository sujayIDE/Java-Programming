package bankingmanagementsystem;

public class LoanAccount extends Account{
    private double loanAmount;
    private String loanType;
    private double interestRate;

    public LoanAccount(int accountNumber, String accountHolderName, double balance, double loanAmount, String loanType, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.loanAmount = loanAmount;
        this.loanType = loanType;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        loanAmount-=amount;
        System.out.println("Current Loan amount is: "+loanAmount);
    }

    @Override
    public void withdraw(double amount) {
        throw new WithdrawNotAllowed("Withdraw not allowed...");
    }

    @Override
    public void calculateInterest() {
        double interest=(loanAmount*1*interestRate)/100;
        System.out.println("Loan Interest : "+interest);
    }
}
