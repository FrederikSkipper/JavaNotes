package exceptions.unCheckedExceptions;
/* The exception is thrown to the main class where the getName is called */
public class UncheckedOne {
    public static void main(String[] args) {
        try {
            getName(null);
        }
        catch (NullPointerException exception) {
            System.out.println("NullException accured");
        }
    }
    private static String getName(String name) throws RuntimeException {
        return name;
    }

}
