package behavioralDesignPatterns.strategyPatterm;

// Concrete strategy
public class DefensiveStrategy implements SoccerStrategy {
    @Override
    public void formation() {
        System.out.println("5-4-1");
    }
}
