package bankingmanagementsystem;

public class Driver {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Rohit", 8975132553L, "rohit@gmail.com", "MP");

        SavingAccount savingAccount = new SavingAccount(101010101, "Ajay", 4000.0);
        System.out.println("Saving Account.........");
        savingAccount.deposit(5000.0);
        savingAccount.withdraw(3000.0);
        savingAccount.calculateInterest();
        System.out.println();
        System.out.println("==================================================================");
        System.out.println();
        CurrentAccount currentAccount = new CurrentAccount(2020202, "Mohan", 5000.0);
        System.out.println("Current Account.......");
        currentAccount.deposit(10000.0);
        try {
            currentAccount.withdraw(120000.0);
        } catch (RuntimeException e) {
            System.out.println("Withdraw amount is grater than 10000 !!!");
        }
        currentAccount.calculateInterest();
        System.out.println();
        System.out.println("==================================================================");
        System.out.println();

        LoanAccount loanAccount = new LoanAccount(3030303, "Kiran", 10000.0, 500000, "CarLoan", 8.5);
        System.out.println("Loan Acoount......");
        loanAccount.deposit(5000.0);
        try {
            loanAccount.withdraw(1000.0);
        } catch (RuntimeException e) {
            System.out.println("You can not withdraw from Loan Account....");
        }
        loanAccount.calculateInterest();
        System.out.println();
        System.out.println("==================================================================");


        Bank bank = new Bank();
        bank.transfer(currentAccount, savingAccount, 5000.0);
        System.out.println();
        bank.approveLoan(customer, 100000);
        System.out.println();
        bank.generateStatement(currentAccount);
        System.out.println();
        bank.generateStatement(savingAccount);
        System.out.println();
        bank.generateStatement(loanAccount);

        Account[] accounts = {savingAccount, currentAccount, loanAccount};

    }
}
