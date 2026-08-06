public class CardPayment extends Payment{

    public CardPayment(int paymentId, double paymentAmount) {
        super(paymentId, paymentAmount);
    }

    @Override
    public void pay() {
        System.out.println("Pay via CardPayment...");
    }

    @Override
    public void refund() {
        System.out.println("Refund via CardPayment...");
    }
}
