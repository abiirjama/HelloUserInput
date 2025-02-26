package org.example;
import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BloodDonor {

    public static void main(String args[]) {
        // Prompt the user to input their weight
        System.out.println("What is your weight?");
        double weight = doubleInput();

        // Prompt the user to input their age
        System.out.println("How old are you?");
        int age = intInput();

        // Check eligibility using the AND (&&) operator
        if (weight >= 110 && age >= 17) {
            // If both conditions are true, the user is eligible
            System.out.println("You are eligible to be a blood donor");
        } else {
            // If either condition is false, the user is not eligible
            System.out.println("Sorry, you are not eligible");

            // Provide specific feedback based on which condition failed
            if (weight < 110) {
                System.out.println("You do not weigh enough. You must weigh 110lb or more.");
            }
            if (age < 17) {
                System.out.println("You are not old enough. You must be 17 or older.");
            }
        }
    }
}