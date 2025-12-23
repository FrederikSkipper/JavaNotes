package typeConversion.automaticConversion;

public class AutomaticConversion {
    public static void main(String[] args) {
        int a = 10;
        long b = a; // Automatic 

        long c = 10;
        int d = c; // can not convert from long to int (we can miss data)
    }
}
