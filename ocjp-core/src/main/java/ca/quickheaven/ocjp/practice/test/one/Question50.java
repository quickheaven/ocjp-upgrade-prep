package ca.quickheaven.ocjp.practice.test.one;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question50 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("non-existent.txt"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            // } catch (FileNotFoundException | IOException e) { /* original code in the question */
        } catch (IOException e) {

            e.printStackTrace();
        }

        // Assume the non-existent.txt file does not exists. What happens when the code is compiled and run?
        // Compilation fails
        // The FileNotFoundException type is a subclass of IOException. We cannot specify multiple exception classes
        // belonging to the same inheritance chain in a catch block.
    }
}
