package interfaces;

public class NestedClassInterface {
    interface inner {
        void title();
    }
}

class Book implements NestedClassInterface.inner {
    public void title() {
        System.out.println("How to access interface methods from another class");
    }
}
