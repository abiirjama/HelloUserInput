package topic2;

import static input.InputUtils.doubleInput;

public class BusFares{
    public static void main(String[] args) {
        // Array of day names
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double total = 0; // Variable to store the total amount spent

        // Loop through each day to get the amount spent on bus fares
        for (int day = 0; day < dayNames.length; day++) {
            String dayName = dayNames[day];
            double amountSpent = doubleInput("What did you spend on bus fares on " + dayName + "?");
            total = total + amountSpent; // Add the amount spent to the total
        }

        // Print the total amount spent for the week
        System.out.printf("Total for the week = $%.2f", total);
    }
}