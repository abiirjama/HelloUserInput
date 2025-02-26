package topic2;

public class oilChange {
    public static void main(String[] args) {

        int mileage = 156808; // Initial mileage
        int interval = 3680; // Oil change interval

        // Perform oil change 8 times
        for (int oilChange = 0; oilChange < 8; oilChange++) {
            mileage = mileage + interval; // Increase mileage
            System.out.println("Get oil change at " + mileage + " miles"); // Print oil change mileage
        }

        // Alternative loop (incorrect usage example)
        for (int miles = mileage; miles < (mileage + 8 * interval); miles = interval) {
            System.out.println("Get oil change at " + miles + " miles");
        }
    }
}