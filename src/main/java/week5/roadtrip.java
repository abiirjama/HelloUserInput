package week5;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class roadtrip {
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize map of city distances (fixed city name typos)
        Map<String, Integer> distances = new HashMap<>();
        distances.put("Minneapolis", 16);   // Fixed "Univim" to "Minneapolis"
        distances.put("Stillwater", 25);    // Fixed distance from 2 to 25 (more realistic)
        distances.put("Duluth", 127);       // Fixed "Hazelway" to "Duluth"
        distances.put("Rochester", 24);     // Fixed "Uri" to "Rochester"
        distances.put("Red Wing", 8);       // Fixed "Wed Wings" to "Red Wing"

        // Display all available destinations
        System.out.println("Available Minnesota Cities and Distances (miles):");
        System.out.println(distances);

        // Get user's maximum driving distance
        int maxDrivingDistance;
        while (true) {
            try {
                System.out.print("\nEnter your maximum driving distance (miles): ");
                maxDrivingDistance = scanner.nextInt();
                if (maxDrivingDistance > 0) break;
                System.out.println("Please enter a positive number.");
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Find cities within range
        List<String> citiesInRange = new ArrayList<>();
        System.out.println("\nCities within your range:");

        for (Map.Entry<String, Integer> entry : distances.entrySet()) {
            String city = entry.getKey();
            int distance = entry.getValue();

            if (distance <= maxDrivingDistance) {
                System.out.printf("- %s (%d miles)%n", city, distance);
                citiesInRange.add(city);
            }
        }

        // Display results
        if (citiesInRange.isEmpty()) {
            System.out.println("Sorry, no Minnesota cities are within your driving distance.");
        } else {
            System.out.printf("\nYou can visit these %d cities: %s%n",
                    citiesInRange.size(), citiesInRange);
        }
    }
}