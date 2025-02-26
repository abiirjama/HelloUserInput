package webk2;

public class Stars {

    public static void main(String args[]) {

        int size = 10; // Size of the square

        // Outer loop: One iteration per row
        for (int x = 0; x < size; x++) {
            // Inner loop: Print 10 stars per row
            for (int y = 0; y < size; y++) {
                // Use System.out.print to print stars on the same line
                System.out.print("+");
            }

            // Move to the next line
            System.out.println();
        }
    }
}