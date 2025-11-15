package structuralDesignPatterns.CompositeDesignPattern;

public class Audi implements Vechicle {
    private String name; 

    public Audi(String name) {
        this.name = name;
    }

    @Override
    public void ListBrand() {
        System.out.println(name);
    }

    @Override
    public void addVechicle(Vechicle vechicle) {
        throw new UnsupportedOperationException("An Audi can't add an Vechicle, only a Transporter");
    }

}
