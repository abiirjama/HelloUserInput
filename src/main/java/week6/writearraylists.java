package week6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class writearraylists {
    public static void main(String[] args) throws IOException {
        String filename = "ITEC_Classes.txt";

        // 1. WRITE CLASS DATA TO FILE
        writeClassData(filename);

        // 2. READ CLASS DATA FROM FILE
        List<String> loadedClasses = readClassData(filename);

        // 3. DISPLAY LOADED DATA
        System.out.println("\nClasses loaded from file:");
        loadedClasses.forEach(System.out::println);
    }

    private static void writeClassData(String filename) throws IOException {
        // Initialize course data
        List<String> courseNames = List.of("Java", "Web", "C#");
        List<Integer> courseCodes = List.of(2545, 2568, 2565);

        // Write to file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < courseNames.size(); i++) {
                String outputLine = String.format("ITEC %d %s%n",
                        courseCodes.get(i),
                        courseNames.get(i));
                writer.write(outputLine);
            }
            System.out.println("Successfully wrote " + courseNames.size() + " courses to file.");
        }
    }

    private static List<String> readClassData(String filename) throws IOException {
        List<String> loadedClasses = new ArrayList<>();

        // Read from file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                loadedClasses.add(line);
            }
        }
        return loadedClasses;
    }
}
