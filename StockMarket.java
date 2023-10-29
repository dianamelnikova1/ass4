package ass4;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float price;

    public StockMarket() {
        this.price = 100.0f;
    }
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }
}
