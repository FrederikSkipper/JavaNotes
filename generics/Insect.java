package generics;

public class Insect <T> { 
    T lifetime;
    public int g = 2;

    public Insect(T lifetime) { // constuctor
    this.lifetime = lifetime; 
    }

    public void printer() { // metod applied onto object
        System.out.println(lifetime);
    }

}

class Runner {
     public static void main (String[] args) {
        Insect<Integer> myInsect = new Insect<Integer>(20); 
        myInsect.printer();
        Insect<String> stringMyInsect = new Insect<String>("Twenty years");
        stringMyInsect.printer();
    }
}


