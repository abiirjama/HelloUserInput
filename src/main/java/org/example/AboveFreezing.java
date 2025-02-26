package org.example;
import static input.InputUtils.doubleInput;

public class AboveFreezing {
    public static void main(String[] args) {
        // Prompt the user to enter today's temperature in Fahrenheit
        System.out.println("Enter today's temperature in F");
        double temp = doubleInput();

        // Check if the temperature is above or equal to freezing (32°F)
        if (temp >= 32) {
            // This will run if the condition is true
            System.out.println("It's above freezing");
        }
    }
}
