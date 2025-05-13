package week6;

public class stringtoint {
    public static void main(String[] args) {
        // String that we will attempt to convert to a number
        String hopeThisIsANumber = "cat";

        try {
            // Attempt to convert the string to an integer
            // This will throw NumberFormatException if the string is not numeric
            int number = Integer.parseInt(hopeThisIsANumber);

            // This line only executes if the conversion succeeds
            System.out.println("The number is " + number);

        } catch (NumberFormatException e) {
            // This block executes if the conversion fails
            System.out.println(hopeThisIsANumber + " is not a valid integer string.");
        }

        // This line always executes, showing the program continues after the exception
        System.out.println("This is the end of the program");
    }
}