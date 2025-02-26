package org.example;
import static input.InputUtils.intInput;

public class SecretNumber {
    public static void main(String[] args) {
        int secretNumber = 6; // Gizli sayı
        int guess = intInput("Guess the number I am thinking of"); // Kullanıcıdan tahmin alınır

        // Tahmin gizli sayıya eşitse doğru tahmin edilmiştir
        if (guess == secretNumber) {
            System.out.println("You guessed correctly!");
        } else {
            // Değilse, doğru sayıyı söyler
            System.out.println("Sorry, I was thinking of " + secretNumber);
        }
    }
}
