package structuralDesignPatterns.DecoratorDesignPattern;


public class FsdDecorator extends TeslaDecorator {
    public FsdDecorator(Tesla tesla) {
        super(tesla);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 30000;
    }

     @Override
    public String getSpecs() {
        return super.getSpecs() + " + Full Self Drive";
    }
}
