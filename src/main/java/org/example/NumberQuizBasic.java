package org.example;
import static input.InputUtils.intInput;

public class NumberQuizBasic {
    public static void main(String[] args) {
        int secretNumber = 6; // The secret number to guess
        int guess = intInput("Guess the number I am thinking of");

        // Check if the user's guess matches the secret number
        if (guess == secretNumber) {
            System.out.println("You guessed correctly!");
        }

        System.out.println("The end!");
    }
}
