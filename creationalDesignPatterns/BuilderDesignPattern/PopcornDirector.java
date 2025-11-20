package creationalDesignPatterns.BuilderDesignPattern;


public class PopcornDirector {
    // Takes a concrete builder as parameter. Determines the order in which to construct. 
    public void assemble(Builder builder) {
    builder.buildPepperAmount();
    builder.buildSaltAmount();
    builder.buildWheatAmount();
    }
}
