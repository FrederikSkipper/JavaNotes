package behavioralDesignPatterns.observerPattern;

// Concrete Observer 
public class StockApp implements Observer {
    private int price; // store current stockprice

    // Update stockprice
    @Override
    public void updatePrice(int price) {
        this.price = price;
    }
}
