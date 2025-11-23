package behavioralDesignPatterns.strategyPatterm;

// Context class
public class Team {
    private SoccerStrategy soccerStrategy;

    public Team(SoccerStrategy soccerStrategy) {
        this.soccerStrategy = soccerStrategy;
    }

    public void setSoccerStategy(SoccerStrategy soccerStrategy) {
        this.soccerStrategy = soccerStrategy;
    }

    public void setFormation() {
        soccerStrategy.formation();
    }
}
