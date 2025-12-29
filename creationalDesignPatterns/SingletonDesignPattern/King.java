package creationalDesignPatterns.SingletonDesignPattern;

public class King {
    private static King kingInstance;

    // private constructor (We only can have one king at a time.)
    private King() {}

    // Static method can not be overridden. 
    /* Here we check if there already is a king and if not we can create one */
    public static King getInstance() {
        if (kingInstance == null) {
            kingInstance = new King();
        }
        return kingInstance;
    }
    public void KingSpeech() {
        System.out.println("King speeaks");
    }
}
