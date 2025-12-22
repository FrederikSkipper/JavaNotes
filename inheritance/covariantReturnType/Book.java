package inheritance.covariantReturnType;

public class Book {
    Book pageNumber() {
        return new Book();
    }
}

class Novel extends Book {
    @Override
    Novel pageNumber() {
        return new Novel();
    }
}

class Runner {
    public static void main(String[] args) {
        Book book = new Novel(); // downcast 
        book.pageNumber(); // calls child method (Novel)
    }
}

