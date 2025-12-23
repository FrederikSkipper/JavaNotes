package casting.upCasting;

public class upCasting{
    public static void main(String[] args){
    Parent parent = new Child(); // upCast
    parent.parentMethod(); // We can access parent methods.
    parent.OverriddenMethod(); // we can access overridden child methods. 
    parent.childMethod(); // We can not access child specific methods. 
    
    GrandChild grandChild = new GrandChild();
    grandChild.grandChildMethod();
    grandChild.OverriddenMethod();
    grandChild.parentMethod();

    Parent parentTwo = grandChild; // Upcast (Now we can only use parent and overridden child methods)
    parentTwo.parentMethod(); // works
    parentTwo.grandChildMethod(); // does not work after.
    parentTwo.OverriddenMethod(); // works
    }
}

class Parent {
    void parentMethod() {
        // do sum
    }
    void OverriddenMethod() {
        // do sum
    }
}

class Child extends Parent {
    void childMethod() {
        // do sum
    }
    @Override
    void OverriddenMethod() {
        // do sum
    }
} 

class GrandChild extends Parent {
    void grandChildMethod() {
        // do sum
    }

    void OverriddenMethod() {
        // do sum
    }
} 


