package stockmarket;

public class MarketClosedException extends TradingException{

    public MarketClosedException(String message) {
        super(message);
    }
}
