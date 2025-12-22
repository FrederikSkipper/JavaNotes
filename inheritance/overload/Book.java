package inheritance.overload;

public class Book {
    public int pages(int number) {
        return number;
    }
    
    public String pages(String number) {
        return number;
    }

    Book book = new Book();
    int intPages = book.pages(10); // the type of variable determines the method at compile time. 
    String stringPages = book.pages("30");
    
}
