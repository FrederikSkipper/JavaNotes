package exceptions;

public class example {
    int balance = 0;
    static void removeBalance(int balance) throws IndexOutOfBoundsException {
        try {
        balance = balance - 200;
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("You cant make a purchase");
        }
    }

public static void main(String[] args) {
    removeBalance(100); // Throws IndexOutOfBoundException
    }
}
