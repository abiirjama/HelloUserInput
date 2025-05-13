package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class name {
    public static void main(String[] args) throws IOException {
        // Data to write
        String filename = "data.txt";
        String name = "Clara";
        String favoriteColor = "Blue";
        int classCode = 2560;

        // 1. WRITE TO FILE
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(name + "\n");
        writer.write(favoriteColor + "\n");
        writer.write(classCode + "\n");
        writer.close();

        // 2. READ FROM FILE
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();

        System.out.println("File contents:");
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }
}
