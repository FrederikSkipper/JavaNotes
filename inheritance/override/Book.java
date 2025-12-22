package inheritance.override;

public class Book {
    int pageNumber(int number) {
        return number; 
    }
}

class Novel extends Book {
    @Override
    int pageNumber(int number) {
    return number+1;
    }
}
