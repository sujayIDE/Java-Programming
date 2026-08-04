package digitalbankingapi;

public class Driver {
    public static void main(String[] args) {
        DigitalBank digitalBank=new DigitalBank(101,"Rohit",4324348327L,50000.0);
        digitalBank.displayCustomerDetails();
        digitalBank.transferFund();
        digitalBank.approveLoan();
        digitalBank.purchaseInsurance();
    }
}
