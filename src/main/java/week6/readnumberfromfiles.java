package week6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readnumberfromfiles {
    public static void main(String[] args) throws IOException {
        // Initialize list to store valid numbers
        List<Integer> numbers = new ArrayList<>();

        // Create file reader (replace "numbers.txt" with your actual file path)
        try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"))) {
            String line = reader.readLine();

            // Read file line by line
            while (line != null) {
                // Try to parse each line as an integer
                try {
                    int number = Integer.parseInt(line.trim()); // trim() removes whitespace
                    numbers.add(number); // Add to list if successful
                } catch (NumberFormatException e) {
                    // Handle non-integer lines gracefully
                    System.out.println("'" + line + "' is not an integer, ignoring.");
                }

                // Read next line
                line = reader.readLine();
            }
        }

        // Print all successfully parsed numbers
        System.out.println("Valid numbers found: " + numbers);
    }
}