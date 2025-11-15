package structuralDesignPatterns.CompositeDesignPattern;

public class Main {
    public static void main (String[] args) {
        // Create leaf objects
        Vechicle a3 = new Audi("Audi");
        Vechicle a4 = new Audi("Audi");

        // Create composite objects (Objecs that can contain children, via the ArrayList)
        Transporter fordTransporter = new Transporter("Ford Transporter");
        Transporter fiatTransporter = new Transporter("Fiat Transporter");

        // We can fit a composite object within another composite (We can handle it, as it was a simple object)
        fordTransporter.addVechicle(fiatTransporter);

        // We can also fit a simple onbject within. 
        fordTransporter.addVechicle(a3);

        // We can add an object to the nested composite object. 
        fiatTransporter.addVechicle(a4);

        a3.addVechicle(fiatTransporter); // Throws unsupportedOperation error! (A leaf can't contain children)

        // Withing the nested 
        fiatTransporter.ListBrand(); // Output: Fiat Transporter, Audi A4
        fordTransporter.ListBrand(); // Output: Ford Transporter, Audi A3, Fiat Transporter, Audi A4

    }
}
