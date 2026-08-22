import java.util.Scanner;

public class StockMarketAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total days : ");
        int days = scanner.nextInt();

        int[] stockPrices = new int[days];

        System.out.println("Enter stock price for each day : ");

        for (int i = 0; i < days; i++) {
            stockPrices[i] = scanner.nextInt();
        }

        int maxProfit = 0;
        int maxLoss = 0;
        int profitableDays = 0;

        for (int i = 0; i < days; i++) {

            for (int j = i + 1; j < days; j++) {

                int difference = stockPrices[j] - stockPrices[i];

                if (difference > maxProfit) {
                    maxProfit = difference;
                }

                if (difference < 0 && Math.abs(difference) > maxLoss) {
                    maxLoss = Math.abs(difference);
                }
            }
        }

        for (int i = 1; i < days; i++) {

            if (stockPrices[i] > stockPrices[i - 1]) {
                profitableDays++;
            }
        }

        System.out.println("Maximum Profit       : ₹" + maxProfit);
        System.out.println("Maximum Loss         : ₹" + maxLoss);
        System.out.println("Profitable Days      : " + profitableDays);
    }
}
