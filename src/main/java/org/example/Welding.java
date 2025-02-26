package org.example;
import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {
        // Prompt the user to input whether they are wearing cotton clothes
        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");

        // Prompt the user to input whether they are wearing wool clothes
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");

        // Prompt the user to input whether they are wearing closed-toe shoes
        boolean closedToeShoes = yesNoInput("Are you wearing closed toe shoes?");

        // Check if the user is dressed safely for welding
        if ((cottonClothes || woolClothes) && closedToeShoes) {
            System.out.println("You are dressed safely.");
        } else {
            System.out.println("You must wear cotton or wool clothes and closed toe shoes.");
        }
    }
}