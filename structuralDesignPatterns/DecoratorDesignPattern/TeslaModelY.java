package structuralDesignPatterns.DecoratorDesignPattern;

public class TeslaModelY implements Tesla {
    @Override
    public int getPrice() {
        return 300000;
    }

    @Override
    public String getSpecs() {
        return "Model Y";
    }
}
