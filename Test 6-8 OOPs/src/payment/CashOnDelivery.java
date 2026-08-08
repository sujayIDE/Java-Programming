package payment;

public class CashOnDelivery extends Payment{
    public CashOnDelivery(int paymentId, double paymentAmount) {
        super(paymentId, paymentAmount);
    }

    @Override
    public void pay() {
        System.out.println("Payment Id : "+getPaymentId());
        System.out.println("Pay via CashOnDelivery...");
    }

    @Override
    public void refund() {
        System.out.println("Refund via CashOnDelivery...");
    }


}
