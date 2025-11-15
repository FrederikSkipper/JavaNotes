package structuralDesignPatterns.CompositeDesignPattern;
import java.util.ArrayList;
import java.util.List;

public class Transporter implements Vechicle {
    private String name; 
    private List<Vechicle> vechiclesList = new ArrayList<>();

    public Transporter(String name) {
        this.name = name;
    }

    @Override
    public void ListBrand() {
        System.out.println("Transporter contains: " + name);
        for (Vechicle vechicle : vechiclesList) {
            vechicle.ListBrand();
        }
    }

    @Override
    public void addVechicle(Vechicle vechicle) {
        vechiclesList.add(vechicle);
    }


}
