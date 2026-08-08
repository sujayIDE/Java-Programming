package payment;

public class UpiPayment extends Payment{

    public UpiPayment(int paymentId, double paymentAmount) {
        super(paymentId, paymentAmount);
    }

    @Override
    public void pay() {
        System.out.println("Payment Id : "+getPaymentId());
        System.out.println("Payment Amount : "+getPaymentAmount());
        System.out.println("Pay via UPI Payment...");
    }

    @Override
    public void refund() {
        System.out.println("Refund via UPI payment...");
    }
}
