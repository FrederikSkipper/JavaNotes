package creationalDesignPatterns.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        SnackEmployee popcornEmp = new PopcornEmployee();
        popcornEmp.ingredientsFinder();
        
        // Instansiating a dorritosEmp
        SnackEmployee dorritosEmp = new DorritosEmployee();
        // In which overrides the findIngredients() within the ingredientsFinder() function. So we get snack = new durrotos().
        // Therefore the snack.printIngredients(); is equal to Dorritos.printIngredients().   
        dorritosEmp.ingredientsFinder();
    }

}
