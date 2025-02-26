package org.example;
 import static input.InputUtils.*;

public class Prices {
    public static void main(String[] args) {
        // Prompt the user to enter the name of the product
        String productName = stringInput("What is the name of the product?");

        // Prompt the user to enter the price of the product, ensuring it's a positive double
        double price = positiveDoubleInput("What does " + productName + " cost?");

        // Prompt the user to enter the quantity of the product to sell, ensuring it's a positive integer
        int quantity = positiveIntInput("How many " + productName + " to sell?");

        // Calculate the total price by multiplying the price by the quantity
        double totalPrice = price * quantity;

        // Print the total price using concatenation
        System.out.println(quantity + " of " + productName + " at $" +
                price + " each costs $" + totalPrice);

        // Print the total price using formatted output for 2 decimal places
        System.out.printf("%d of %s at $%.2f each costs $%.2f%n",
                quantity, productName, price, totalPrice);
    }
}
