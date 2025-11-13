package creationalDesignPatterns.BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        SnackBuilder snack = new SnackBuilder();
        snack.setName("dorritos");
        snack.setSize(2);
        snack.setPrice(10);
        snack.setCatagory("Chips");
        snack.build();
    }
} 
