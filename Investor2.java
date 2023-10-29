package ass4;

public class Investor2 implements Observer{
    private float price;

    public void update(float price) {
        this.price = price;
        System.out.println("Investor 2: The stock price has changed to " + price);
    }
}
