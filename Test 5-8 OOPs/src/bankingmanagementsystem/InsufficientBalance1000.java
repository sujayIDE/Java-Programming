package bankingmanagementsystem;

public class InsufficientBalance1000 extends RuntimeException{
    public InsufficientBalance1000() {
    }

    public InsufficientBalance1000(String message) {
        super(message);
    }
}
