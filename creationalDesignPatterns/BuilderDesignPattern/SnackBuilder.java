package creationalDesignPatterns.BuilderDesignPattern;

public class SnackBuilder {
    private String name;
    private int size;
    private int price;
    private String catagory;

    public SnackBuilder setName(String name){
    this.name = name;
        return this;
    }
    public SnackBuilder setSize(int size){
    this.size = size ;
        return this;
    }
    public SnackBuilder setPrice(int price){
    this.price = price;
        return this;
    }
    public SnackBuilder setCatagory(String catagory){
    this.catagory = catagory;
        return this;
    }

    public String hasName(String name){
        return name;
    }
    public int hasSize(int size){
        return size;
    }
    public int  hasPrice(int price){
        return price;
    }
    public String hasCatagory(String catagory){
        return catagory;
    }

    public Snack build() {
        return new Snack(this);
    }
} 

