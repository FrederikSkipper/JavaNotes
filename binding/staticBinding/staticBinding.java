package binding.staticBinding;

public class staticBinding {
    void shout() {
        System.out.println("HU HU HU");
    }

    void shout(int i) {
        System.out.println(i);
    }

public static void main (String[] args) {
    staticBinding a = new staticBinding();
    a.shout(); // The type of shout is determined at compile time, based on input parms (Overloading)
    }
}


