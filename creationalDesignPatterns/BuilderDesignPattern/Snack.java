package creationalDesignPatterns.BuilderDesignPattern;

public class Snack {
    private String name;
    private int size;
    private int price;
    private String catagory;

    public Snack(SnackBuilder builder) {
    this.name = builder.hasName(name);
    this.size = builder.hasSize(size);
    this.price = builder.hasPrice(price);
    this.catagory = builder.hasCatagory(catagory);
    }
}
