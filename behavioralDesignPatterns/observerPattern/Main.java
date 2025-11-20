package behavioralDesignPatterns.observerPattern;

public class Main {
    public static void main(String[] args) {
        // Concrete subject initialised
        StockExchange stockExchange = new StockExchange();

        // Observer initialised
        Observer stockApp = new StockApp();

        // Register an observer from stockApp on stockExchange Subject.
        stockExchange.addObserver(stockApp);

        // Change the stockprice on the StockExchange
        stockExchange.newStockprice(200);
        
        // This leads to the notifyObserver being called and inside this is update method.
        // The update method is iterated over all Observers and the update method is implemented by the StockApp. 
        // Therefore the stockApp overrides update and gets price.
    }
}
