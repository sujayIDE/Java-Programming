public class UpiPayment extends Payment{

    public UpiPayment(int paymentId, double paymentAmount) {
        super(paymentId, paymentAmount);
    }

    @Override
    public void pay() {
        System.out.println("Pay via UPI Payment...");
    }

    @Override
    public void refund() {
        System.out.println("Refund via UPI payment...");
    }
}
