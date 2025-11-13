package structuralDesignPatterns.DecoratorDesignPattern;

public abstract class TeslaDecorator implements Tesla {
    public Tesla decoratedTesla;
    
    public TeslaDecorator(Tesla tesla) {
        this.decoratedTesla = tesla;
    }

    @Override
    public int getPrice() {
        return decoratedTesla.getPrice();
    }

    @Override
    public String getSpecs() {
        return decoratedTesla.getSpecs();
    }
}
