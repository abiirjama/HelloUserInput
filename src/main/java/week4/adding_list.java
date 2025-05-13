package week4;
import java.util.ArrayList;
import java.util.List;

public class adding_list {
    public static void main(String[] args) {
        // Create a List of Integers
        List<Integer> classCodes = new ArrayList<>();

        // Add elements to the end of the list
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);

        // Add element at specific index (0 = beginning)
        classCodes.add(0, 1425);

        // This will throw IndexOutOfBoundsException because index 10 doesn't exist yet
        // classCodes.add(10, 1100); // Commented out to prevent error

        // Proper way to add 1100 (at end of list)
        classCodes.add(1100);

        // Print the entire list
        System.out.println(classCodes); // [1425, 2545, 1150, 1250, 1100]

        // Print list size
        System.out.println(classCodes.size()); // 5

        // Print each element with prefix
        for (Integer code : classCodes) {
            System.out.println("ITEC " + code);
        }
    }
}