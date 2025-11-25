package behavioralDesignPatterns.visitorPattern;

// Element interface
public interface Vechicle {
    void accept(VechicleInspector inspector);
}
