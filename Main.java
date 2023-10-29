package ass4;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Investor1 investor1 = new Investor1();
        Investor2 investor2 = new Investor2();

        stockMarket.attach(investor1);
        stockMarket.attach(investor2);

        stockMarket.setPrice(110.0f);
        stockMarket.setPrice(120.0f);
    }
}
