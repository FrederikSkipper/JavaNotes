package creationalDesignPatterns.SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        // This is how to access Singleton Instance. 
        // We can not access the instance normally as seen. 
        // We can 
        King frederik = King.getInstance();
        King frederiktTwo = new King(); // Error "not visible" 

        frederik.KingSpeech();
    }
}
