package org.example;

import static input.InputUtils.stringInput;

public class Main {
    public static void main(String[] args) {

        // Prompt the user to enter their email address
        String email = stringInput("Enter your email");
        double bookPrice = 40; // Initial price of the book
        double discount = 0; // Initial discount is 0%

        // Check if the email ends with ".edu" to apply a student discount
        if (email.endsWith(".edu")) {
            System.out.println("Your student email is " + email);
            discount = 10; // Apply a 10% student discount
        }

        System.out.println(email); // Print the email address

        // Calculate the final price after applying the discount
        bookPrice = bookPrice / 100 * (100 - discount);
        System.out.println(bookPrice); // Print the discounted price
    }

    // Method to print a list of books
    public static void printBookList(String[] books) {
        for (int x = 0; x < books.length; x++) { // Loop through each book in the list
            String book = books[x]; // Get the current book title

            // Truncate longer book titles to 50 characters
            if (book.length() > 50) {
                book = book.substring(0, 50) + "..."; // Add "..." if the title is longer than 50 characters
            }

            System.out.println(x + 1 + "';" + book); // Print the book number and title
        }

        // x exists here? - No
        // book exists here? - No
        // books exists here? - Yes
        System.out.println(books); // Print the list of books
    }
}