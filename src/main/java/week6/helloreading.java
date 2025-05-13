package week6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class helloreading {
    public static void main(String[] args) throws IOException {
        // Create file reader and buffered reader
        FileReader reader = new FileReader("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        // Read first line
        String line = bufferedReader.readLine();

        // Continue reading until end of file (null)
        while (line != null) {
            System.out.println(line);  // Print each line
            line = bufferedReader.readLine();  // Read next line
        }

        // Close resources
        bufferedReader.close();
    }
}