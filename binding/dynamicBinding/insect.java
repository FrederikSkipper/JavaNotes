package binding.dynamicBinding;

public class insect {
      public void lifetime() {
        System.out.println("insect age");
    }
}

class snail extends insect {
    @Override
    public void lifetime() {
        System.out.println("snail age");
    }
}

class Main {
    public static void main(String[] args) {
        insect insect = new snail(); // creating a snail object but reference it as insect // Compiler chooses Snail object at runtime and not the reference class. 
        insect.lifetime(); // output: snail age. - (dynamic binding at runtime determined which lifetime method is correct.)
    }
}
