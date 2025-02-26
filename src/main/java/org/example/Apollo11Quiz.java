package org.example;

import static input.InputUtils.intInput;

public class Apollo11Quiz {
    public static void main(String[] args) {
        // Start the quiz
        System.out.println("Quiz time!");
        System.out.println("What year did the Apollo 11 spaceship land on the moon?");

        // Hint: The correct year is 1969
        int answer = intInput(); // Get the user's answer

        // Check if the user's answer is not equal to 1969
        if (answer != 1969) {
            System.out.println("Wrong answer - it was 1969");
        }
    }
}
