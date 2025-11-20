package behavioralDesignPatterns.observerPattern;
import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class StockExchange implements Subject {
private List<Observer> observers = new ArrayList<>();
private int price; // updates if newStockprice is called in main.

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    } 

    @Override
    public void removeObserver(Observer observer) {
          observers.remove(observer);
    } 

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.updatePrice(price); // StockApp implements Observer interface and overrides and gets price.
        }
    }

    public void newStockprice(int newPrice) {
        this.price = newPrice;
        notifyObserver();
    }

}
