package abstractClass;

/* Explanation: We need to use the methods from the abstract class in the subclass. All actions must..
handled/called from thes subclass object */

abstract class Insect {
    public void hello() {
        System.out.println("Hello");
    }
}

class subClass extends Insect {

}

class Main {
    public static void main(String[] args) {
        subClass obj = new subClass();
        obj.hello();
    }
}