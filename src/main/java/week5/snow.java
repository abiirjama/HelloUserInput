package week5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class snow {
    public static void main(String[] args) {
        // Initialize HashMap to store monthly snowfall data
        Map<String, Double> snowfall = new HashMap<>();

        // Pre-populate with some data
        snowfall.put("January", 3.1);
        snowfall.put("February", 12.4);
        snowfall.put("December", 5.1);

        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 1. Get month name from user
            System.out.print("Enter name of month (or 'quit' to exit): ");
            String newMonth = scanner.nextLine();

            if (newMonth.equalsIgnoreCase("quit")) {
                break;
            }

            // 2. Get snowfall amount (with validation)
            double newSnow = 0;
            while (true) {
                System.out.print("Enter amount of snow for " + newMonth + " (inches): ");
                try {
                    newSnow = Double.parseDouble(scanner.nextLine());
                    if (newSnow >= 0) break;
                    System.out.println("Please enter a positive number.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }

            // 3. Check if month already exists
            Double existingSnow = snowfall.get(newMonth);

            if (existingSnow != null) {
                // Month exists - ask about overwrite
                System.out.printf("%s already has %.1f inches of snow. Overwrite? (yes/no): ",
                        newMonth, existingSnow);
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("yes")) {
                    snowfall.put(newMonth, newSnow);
                    System.out.println("Data updated.");
                } else {
                    System.out.println("Data was not changed.");
                }
            } else {
                // New month - add automatically
                snowfall.put(newMonth, newSnow);
                System.out.println("New month added.");
            }

            // 4. Display current data
            System.out.println("\nCurrent Snowfall Data:");
            for (Map.Entry<String, Double> entry : snowfall.entrySet()) {
                System.out.printf("- %s: %.1f inches%n", entry.getKey(), entry.getValue());
            }
            System.out.println();
        }

        // Final output
        System.out.println("\nFinal Snowfall Records:");
        System.out.println(snowfall);
    }
}