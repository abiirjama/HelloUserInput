package org.example;

import static input.InputUtils.positiveDoubleInput;

public class MilesToMCTC {
    public static void main(String[] args) {
        // Prompt the user to input the distance in miles from their house to WCIC
        double miles = positiveDoubleInput("How many miles from your house to WCIC?");

        // Convert the distance from miles to kilometers (1 mile = 1.6 kilometers)
        double km = miles * 1.6;

        // Display the distance in kilometers
        System.out.println("You live " + km + " kilometers from school.");

        // Check if the user lives more than, exactly, or less than 10 miles away
        if (miles > 10) {
            // If the distance is greater than 10 miles, print this message
            System.out.println("You live more than 10 miles away.");
        } else if (miles == 10) {
            // If the distance is exactly 10 miles, print this message
            System.out.println("You live exactly 10 miles away.");
        } else {
            // If the distance is less than 10 miles, print this message
            System.out.println("You live less than 10 miles away.");
        }
    }
}