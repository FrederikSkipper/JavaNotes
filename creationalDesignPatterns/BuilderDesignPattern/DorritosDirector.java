package creationalDesignPatterns.BuilderDesignPattern;

public class DorritosDirector {
    // Takes a concrete builder as parameter. Determines the order in which to construct. 
    public void assemble(Builder builder) {
    builder.buildSaltAmount();
    builder.buildPepperAmount();
    builder.buildWheatAmount();
    }
}

