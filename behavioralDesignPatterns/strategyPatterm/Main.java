package behavioralDesignPatterns.strategyPatterm;

public class Main {
    public static void main(String[] args){
        // Create a team that uses a Strategy.
        Team Spurs = new Team(new OffensiveStrategy());

        // setFormation calls formation. 
        Spurs.setFormation(); // Output: 4-3-3
    }
}

/*
Explanation:
First we create a team with the Team Constructor which takes an Startegy as arguments. 
The Strategy passed in as argument, decides which formation(); method to be applied. 
Abstract is automaticcally overriden!

*/