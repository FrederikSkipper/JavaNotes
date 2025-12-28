package scope;
/*
Explanation:
When a variable in a Child class has the same name as the variable in the parent class. 
The child variable book hides the parent variable book, so child instance will always print Toy story, except with super. 
*/
public class VariableHiding {
    String book = "Harry potter";

    public void title(){
        System.out.println(book);
    } 
}

class Child extends VariableHiding {
    String book = "Toy story";

    @Override
    public void title(){
        System.out.println(book);
    }
    
    public void parentTitle() {
        System.out.println(super.book);
    }
}

class main {
    public static void main(String[] args) {
        Child caller = new Child();
        caller.title(); // prints "Toy story"
        caller.parentTitle(); // prints "Harry potter"
    }
}
