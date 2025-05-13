package week5;
import java.util.HashMap;
import java.util.Map;

public class classcodes {
    public static void main(String[] args) {
        // Create a HashMap to store class codes (Integer) and class names (String)
        Map<Integer, String> classCodes = new HashMap<>();

        // Add course codes and their corresponding names
        classCodes.put(2545, "Java Programming");
        classCodes.put(1425, "Database Systems");
        classCodes.put(2560, "Web Development");

        // Print all classes in "ITEC [code] [name]" format
        System.out.println("My Current Classes:");
        for (Integer code : classCodes.keySet()) {
            String name = classCodes.get(code);
            System.out.println("ITEC " + code + " " + name);
        }

        // Print total number of classes using size()
        System.out.println("\nTotal classes enrolled: " + classCodes.size());

        // Search for specific class codes
        int searchCode1 = 2560;
        int searchCode2 = 2565; // This code doesn't exist

        // Check if HashMap contains the first code
        if (classCodes.containsKey(searchCode1)) {
            System.out.println("\nClass found: ITEC " + searchCode1 + " - " + classCodes.get(searchCode1));
        } else {
            System.out.println(searchCode1 + " not found");
        }

        // Check if HashMap contains the second code
        if (classCodes.containsKey(searchCode2)) {
            System.out.println("Class found: ITEC " + searchCode2 + " - " + classCodes.get(searchCode2));
        } else {
            System.out.println(searchCode2 + " not found");
        }
    }
}