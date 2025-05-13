package week6;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class hellowriting {
    public static void main(String[] args) throws IOException {
        // Create/overwrite a file (will erase existing content)
        FileWriter writer = new FileWriter("Hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // Write lines to the file
        bufferedWriter.write("Hello!");
        bufferedWriter.newLine(); // Add line break
        bufferedWriter.write("Hello Java Students!");
        bufferedWriter.newLine();
        bufferedWriter.write("Goodbye!");
        bufferedWriter.newLine();

        // Close resources to flush and release file
        bufferedWriter.close();
    }
}