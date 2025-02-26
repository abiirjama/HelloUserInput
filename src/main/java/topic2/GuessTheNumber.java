package topic2;


import java.util.Random;
import static input.InputUtils.intInput;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int secretNumber = random.nextInt();
        int guess = intInput("Guess the number!");

        while (guess != secretNumber) {
            System.out.println("That's wrong, try again!");

            if (guess < secretNumber) {
                System.out.println("Guess higher!");
            }

            if (guess > secretNumber) {
                System.out.println("Guess lower!");
            }

            guess = intInput("Guess the number!");
        }
    }
}