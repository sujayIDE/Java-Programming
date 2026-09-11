package stockmarket;

public class InsufficientBalanceException extends TradingException{

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
