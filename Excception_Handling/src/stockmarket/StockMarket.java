package stockmarket;

public class StockMarket {
    private static final double SHARE_PRICE = 2500.0;
    private static final int AVAILABLE_SHARES = 100;

    void checkMarket(String status) throws MarketClosedException {
        if(status.equalsIgnoreCase("closed"))
        {
            throw new MarketClosedException("Stock Market is Closed. Trading is not allowed.");
        }
    }
}

