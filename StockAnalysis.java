package client;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StockAnalysis {
	
	public static void findHighestAndLowestPrice(String filePath) {
        Map<String, StockData> highestPrices = new HashMap<>();
        Map<String, StockData> lowestPrices = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Read header
            if (line == null) {
                System.out.println("The file is empty.");
                return;
            }


            // Read data lines
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String date = data[0]; // Date
                String company = data[1]; // Stock Symbol (Company)
                double open = Double.parseDouble(data[2]); // Open Price
                double highPrice = Double.parseDouble(data[3]); // High Price
                double lowPrice = Double.parseDouble(data[4]); // Low Price
                double close = Double.parseDouble(data[5]); // Close Price
                double adj_close = Double.parseDouble(data[6]); // Adjusted Close Price
                long volume = Long.parseLong(data[7]); // Volume

                StockData currentStock = new StockData(date, company, open, highPrice, lowPrice, close,adj_close, volume);

                // Update highest price
                highestPrices.putIfAbsent(company, currentStock);
                if (currentStock.getHigh() > highestPrices.get(company).getHigh()) {
                    highestPrices.put(company, currentStock);
                }

                // Update lowest price
                lowestPrices.putIfAbsent(company, currentStock);
                if (currentStock.getLow() < lowestPrices.get(company).getLow()) {
                    lowestPrices.put(company, currentStock);
                }
            }

            // Print results
            System.out.println("Current Highest and Lowest Prices for Each Company:");
            for (String company : highestPrices.keySet()) {
                System.out.println("\nCompany: " + company);

                System.out.println("Highest Price Data:");
                System.out.println(highestPrices.get(company));

                System.out.println("Lowest Price Data:");
                System.out.println(lowestPrices.get(company));
            }

        } catch (IOException | NumberFormatException e) {
            System.err.println("An error occurred while processing the file: " + e.getMessage());
        }
	}
}
