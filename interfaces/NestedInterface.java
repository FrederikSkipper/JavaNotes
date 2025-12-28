package interfaces;

public interface NestedInterface {
    void showBookStore();

    interface book {
        void title();
    }
}

class User implements NestedInterface.book {
    public void title() {
        System.out.println("Using the nested interface method");
    }

    public static void main(String[] args) {
        NestedInterface.book harryPotter =  new User();
        harryPotter.title();

    }
}