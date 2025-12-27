package exceptions.checkedExceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionTwo {
    public static void main(String[] args) {
        readerTwo("filename"); // Unhandled exception type FileNotFoundException
    }
    
    private static void readerTwo(String file) throws FileNotFoundException {
        BufferedReader brtwo = new BufferedReader(new FileReader(file)); 
    }

}

