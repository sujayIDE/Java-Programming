package payment;

public abstract class Payment {
    private int paymentId;
    private double paymentAmount;

    public Payment(int paymentId, double paymentAmount) {
        this.paymentId = paymentId;
        this.paymentAmount = paymentAmount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public abstract void pay();
    public abstract void refund();
}
