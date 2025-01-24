package client;

public class StockData {
	String date;
    String company;
    double open;
    double high;
    double low;
    double close;
    double adj_close;
    long volume;

    public StockData(String date, String company, double open, double high, double low, double close, double adj_close, long volume) {
        this.date = date;
        this.company = company;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.adj_close = adj_close;
        this.volume = volume;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    @Override
    public String toString() {
        return "Date: " + date +
        	   ", Stock Symbol(Company): " + company +
               ", Open: " + open +
               ", High: " + high +
               ", Low: " + low +
               ", Close: " + close +
               ", Adjusted_Close: " + adj_close +
               ", Volume: " + volume;
    }
}
