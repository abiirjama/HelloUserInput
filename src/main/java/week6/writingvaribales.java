package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class writingvaribales {
        public static void main(String[] args) throws IOException {
            // First write initial content
            FileWriter writer1 = new FileWriter("Hello.txt");
            BufferedWriter bufferedWriter1 = new BufferedWriter(writer1);

            bufferedWriter1.write("Initial line 1");
            bufferedWriter1.newLine();
            bufferedWriter1.write("Initial line 2");
            bufferedWriter1.close();

            // Then append additional content
            FileWriter writer2 = new FileWriter("Hello.txt", true); // true = append mode
            BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

            bufferedWriter2.write("Appended line 1");
            bufferedWriter2.newLine();
            bufferedWriter2.write("Appended line 2");
            bufferedWriter2.close();
        }
    }

