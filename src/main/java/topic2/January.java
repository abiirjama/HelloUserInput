package topic2;

public class January {
    public static void main(String[] args) {

        // Loop through days from 1 to 31
        for (int day = 1; day <= 31; day++) {
            // If the day is 1, 21, or 31, append "st"
            if (day == 1 || day == 21 || day == 31) {
                System.out.println("January " + day + "st");
            }
            // For other days, append "th"
            else {
                System.out.println("January " + day + "th");
            }
        }
    }
}