package week6;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class throwfrommethod {
    public static void main(String[] args) {
        // File that may or may not exist
        String filename = "not_exists.txt"; // Try with existing file if this fails

        try {
            List<String> data = readFromFile(filename);
            System.out.println("File contents: " + data);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            System.out.println("Suggested action: Check if file exists and try again");
        }
    }

    /**
     * Reads all lines from a text file
     * @param filename Path to the file
     * @return List of lines from the file
     * @throws IOException If file cannot be read or doesn't exist
     */
    private static List<String> readFromFile(String filename) throws IOException {
        // Try-with-resources automatically closes the BufferedReader
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            List<String> lines = new ArrayList<>();
            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        }
    }
}
