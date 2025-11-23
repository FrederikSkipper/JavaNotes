package behavioralDesignPatterns.strategyPatterm;

// Concrete strategy
public class OffensiveStrategy implements SoccerStrategy {
    @Override
    public void formation() {
        System.out.println("4-3-3");
    }
}
