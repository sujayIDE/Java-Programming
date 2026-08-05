package bankingmanagementsystem;

public class WithdrawNotAllowed extends RuntimeException{
    public WithdrawNotAllowed() {
    }

    public WithdrawNotAllowed(String message) {
        super(message);
    }
}
