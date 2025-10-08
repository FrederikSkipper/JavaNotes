package interfaces;

interface insect {
    public void lifetime(); // an interface method does not posses a body
    public void legs();
}
class snail implements insect {
    public void lifetime() {
        System.out.println("snail age"); // The interface insects is applied to the class snail. 
    }
    public void legs() {
        System.out.println("snail has no legs");
    }
}

class Main {
    public static void main(String[] args) {
        snail mySnail = new snail();
        mySnail.lifetime();
        mySnail.legs();
    }
}
