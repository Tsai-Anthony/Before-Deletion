package anthony;

import java.util.List;

import anthony_pojo.amazon;
public class webScrape_AmazonMaxMinAvg {

    public static void calculateAndPrintStats(List<amazon> results) {
        double totalPrices = 0;
        double maxPrice = Double.MIN_VALUE;
        double minPrice = Double.MAX_VALUE;

        for (amazon result : results) {
            double price = result.getPrice();
            totalPrices += price;

            if (price > maxPrice) {
                maxPrice = price;
            }

            if (price < minPrice) {
                minPrice = price;
            }
        }

        double averagePrice = totalPrices / results.size();

        System.out.println("Max: $" + maxPrice);
        System.out.println("Min: $" + minPrice);
        System.out.println("Average Price: $" + averagePrice);
    }
}
