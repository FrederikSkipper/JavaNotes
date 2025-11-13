package structuralDesignPatterns.DecoratorDesignPattern;

public class AutoPilotDecorator extends TeslaDecorator {
    public AutoPilotDecorator(Tesla tesla) {
        super(tesla);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 30000;
    }

     @Override
    public String getSpecs() {
        return super.getSpecs() + " + Autopilot";
    }
}
