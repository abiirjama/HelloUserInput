package week6;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingnumbers {
    public static void main(String[] args) throws IOException {
        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        // Create file writer (overwrites existing file)
        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // Write numbers as characters (using ASCII values)
        bufferedWriter.write(data1); // Writes 'C' (ASCII 67)
        bufferedWriter.write(data2); // Writes 'A' (ASCII 65)
        bufferedWriter.write(data3); // Writes 'T' (ASCII 84)

        bufferedWriter.close();
    }
}