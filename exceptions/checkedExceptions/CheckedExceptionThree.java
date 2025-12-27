package exceptions.checkedExceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
/* Explanation: We could also have used a thrown FileNotFoundException in the method and invoked the try catch on the main */
public class CheckedExceptionThree {
    public static void main(String[] args) {
        readerThree("filename");
    }
    
    private static void readerThree(String file) {
        try {
        BufferedReader brThree = new BufferedReader(new FileReader(file));
        }
        catch (FileNotFoundException exception) {
            System.out.print("Could not find file");
        }
    }

}