package digitalbankingapi;

public class DigitalBank implements Transfer,Loan, Insurance {
    private int customerId;
    private String customerName;
    private long accountNumber;
    private double accountBalance;

    public DigitalBank(int customerId, String customerName, long accountNumber, double accountBalance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }


    @Override
    public void purchaseInsurance() {
        System.out.println("Simulate purchasing an insurance policy....");
    }

    @Override
    public void approveLoan() {
        System.out.println("Simulate a loan approval....");
    }

    @Override
    public void transferFund() {
        System.out.println("Simulate fund transfer....");
    }

    void displayCustomerDetails(){
        System.out.println("Customer Id : "+customerId);
        System.out.println("Customer Name : "+customerName);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Balance : "+accountBalance);
    }
}
