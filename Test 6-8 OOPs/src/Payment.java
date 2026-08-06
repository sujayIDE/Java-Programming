public abstract class Payment {
    private int paymentId;
    private double paymentAmount;

    public Payment(int paymentId, double paymentAmount) {
        this.paymentId = paymentId;
        this.paymentAmount = paymentAmount;
    }

    public abstract void pay();
    public abstract void refund();
}
