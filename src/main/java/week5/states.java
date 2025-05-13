package week5;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

public class states {
    public static void main(String[] args) {
        // Create a HashMap to store state names and their abbreviations
        Map<String, String> stateAbbreviations = new HashMap<>();

        // Add state abbreviations (fixed typos in state names)
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        // Print the entire map
        System.out.println("All State Abbreviations:");
        System.out.println(stateAbbreviations);
        // Output: {Minnesota=MN, Iowa=IA, Wisconsin=WI, Michigan=MI}

        // Retrieve and print specific abbreviations
        System.out.println("\nMinnesota's abbreviation: " +
                stateAbbreviations.get("Minnesota")); // MN
        System.out.println("Iowa's abbreviation: " +
                stateAbbreviations.get("Iowa"));      // IA

        // Store and print Wisconsin's abbreviation
        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println("Wisconsin's abbreviation: " + wisconsinAbbreviation); // WI

        // Iterate through all entries in the HashMap
        System.out.println("\nAll States and Their Abbreviations:");
        for (String stateName : stateAbbreviations.keySet()) {
            String abbreviation = stateAbbreviations.get(stateName);
            System.out.println(stateName + " (" + abbreviation + ")");
        }

        // Alternative iteration using Map.Entry (more efficient)
        System.out.println("\nAlternative Iteration Method:");
        for (Map.Entry<String, String> entry : stateAbbreviations.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}