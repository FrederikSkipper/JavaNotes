package casting.downCasting;

public class downCasting{
    public static void main(String[] args){
    /* 
        We create a child instance with parent reference, because a Child is just a more specific parent. 
        So allowing a child to access more general info, is just fine.
        Then we can convert the child back to its normal form. 
    */
    Parent parent = new Child(); // Upcast parent (We need this for below line to not runTime Exception)
    Child child = (Child) parent; // We can downcast because parent is an instance of subclass. 
    
    child.parentMethod(); // We can access parent methods.
    child.OverriddenMethod(); // we can access overridden child methods. 
    child.childMethod(); // We CAN access child specific methods. 
    
    /* 
        We create a parent instance with parent reference.
        But allowing a parent to access child information, without it being a child is forbidden!
        The actual object must be of type child. 
    */
    Parent parentTwo = new Parent();  // Create parent
    Child childTwo = (Child) parent; // Tries to cast but can not. (Runtime Exception)
    
    
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
