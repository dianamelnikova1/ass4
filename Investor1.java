package ass4;

public class Investor1 implements Observer{
    private float price;

    @Override
    public void update(float price) {
        this.price = price;
        System.out.println("Investor 1: The stock price has changed to " + price);
    }
}
