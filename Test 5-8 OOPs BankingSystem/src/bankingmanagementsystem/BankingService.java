package bankingmanagementsystem;

public interface BankingService {
    void transfer(Account from, Account to, double amount);

    void approveLoan(Customer customer, double amount);

    void generateStatement(Account account);
}
