package org.example;
import static input.InputUtils.positiveIntInput;
import static input.InputUtils.stringInput;

public class ifstatment {
    public static void main(String[] args) {
        // Prompt the user to enter their name and store it in a variable
        String name = stringInput("Please enter your name");
        System.out.println("Hello, " + name + "!");

        // Prompt the user to enter the number of classes they are taking and store it in a variable
        int numberOfClasses = positiveIntInput("How many classes are you taking this semester?");

        // Determine the correct pluralization for "class" or "classes"
        String units = "classes";
        if (numberOfClasses == 1) {
            units = "class";
        }

        // Print the number of classes the user is taking
        System.out.println("You are taking " + numberOfClasses + " " + units + " this semester.");
        System.out.printf("You are taking %d %s this semester%n", numberOfClasses, units);
    }
}
