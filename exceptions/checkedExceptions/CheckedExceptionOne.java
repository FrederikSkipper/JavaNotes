package exceptions.checkedExceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionOne {
    public static void main(String[] args) {
        reader("filename");
    }
    
    private static void reader(String file) {
        // Unhandled exception type FileNotFoundException
        BufferedReader br = new BufferedReader(new FileReader(file)); 
    }
    
}
