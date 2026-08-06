package bankingmanagementsystem;

public class Bank implements BankingService {
    @Override
    public void transfer(Account from, Account to, double amount) {
        System.out.println("Verify sufficient balance.\n" +
                "Deduct money from the sender.\n" +
                "Credit the receiver.\n" +
                "Display success message.\n" +
                "Loan Approval");
    }

    @Override
    public void approveLoan(Customer customer, double amount) {
        if (amount <= 1000000) {
            System.out.println("Customer is eligible for loan....");
        } else {
            System.out.println("Loan rejected...");
        }
    }

    @Override
    public void generateStatement(Account account) {
        System.out.println("Customer Name   : " + account.getAccountHolderName());
        System.out.println("Account Number  : " + account.getAccountNumber());
        System.out.println("Current Balance : " + account.getBalance());
        System.out.println("Account Type    : " + account.getClass().getName());
    }
}
