package exception_in_java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exception7 {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close the BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
        catch (IOException e) 
        {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
