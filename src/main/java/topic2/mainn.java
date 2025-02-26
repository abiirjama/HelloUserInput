package topic2;

package topic2;
import static input.InputUtils.stringInput;

public static void mainn(String[] args) {
    String secretPassword = "kittens";
    System.out.println();
    String userPassword = stringInput("Enter the password");
    int maxGuesses = 5;
    // Before we let the user in, we need to check that the password is correct
   // This loop will repeat while the password is NOT "kittens", our secretPassword
    while (!userPassword.equals(secretPassword) && maxGuesses > 1) {
        System.out.println("Password incorrect, access denied!");
        System.out.println("Try again");
        userPassword = stringInput("Enter the password");
        maxGuesses--;
    }

    if (maxGuesses > 1) { // ran out of guesses
        System.out.println("Correct password - access granted");
    } else {
        System.out.println("Max number of password attempts.");
        System.exit(0);
    }

}
