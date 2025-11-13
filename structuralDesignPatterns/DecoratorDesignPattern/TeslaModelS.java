package structuralDesignPatterns.DecoratorDesignPattern;

public class TeslaModelS implements Tesla{
    @Override
    public int getPrice() {
        return 600000;
    }

    @Override
    public String getSpecs() {
        return "Model S";
    }

}
