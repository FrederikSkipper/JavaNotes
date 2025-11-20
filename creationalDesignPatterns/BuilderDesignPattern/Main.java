package creationalDesignPatterns.BuilderDesignPattern;
// Client interaction
public class Main {
    public static void main(String[] args) {

        /* INSTANCE 1: BUILD A dorritos */

        // Concrete builder initialised
        DorritosBuilder dorritosBuilder = new DorritosBuilder(); 
        // Director initialised
        DorritosDirector dorritosDirector = new DorritosDirector();


        dorritosDirector.assemble(dorritosBuilder);

        Snack dorritos = dorritosBuilder.getIngredients();
        System.out.println(dorritos); // Print product ingredients out. 
        



        /* INSTANCE 2: BUILD A Popcorn */

        // Concrete builder initialised
        PopcornBuilder PopcornBuilder = new PopcornBuilder(); 
        // Director initialised
        PopcornDirector popcornDirector = new PopcornDirector();

        popcornDirector.assemble(dorritosBuilder);

        Snack popcorn = PopcornBuilder.getIngredients();
        System.out.println(popcorn); // Print product ingredients out. 



    }
}

