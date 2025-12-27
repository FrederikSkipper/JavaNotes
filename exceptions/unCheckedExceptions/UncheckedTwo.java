package exceptions.unCheckedExceptions;
/* The exception is handled inside the function */
public class UncheckedTwo {
    public static void main(String[] args) {
        getName(null);
    }
    private static void getName(String name) throws RuntimeException {
        try {
            System.out.println(name);
        }
        catch (NullPointerException runtimeException) {
            System.out.println("NullException accured");
        }
    }
}
