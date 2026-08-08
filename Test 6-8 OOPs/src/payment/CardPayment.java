package payment;

public class CardPayment extends Payment{

    public CardPayment(int paymentId, double paymentAmount) {
        super(paymentId, paymentAmount);
    }

    @Override
    public void pay() {
        System.out.println("Payment Id : "+getPaymentId());
        System.out.println("Payment Amount : "+getPaymentAmount());
        System.out.println("Pay via CardPayment...");
    }

    @Override
    public void refund() {
        System.out.println("Refund via payment.CardPayment...");
    }
}
