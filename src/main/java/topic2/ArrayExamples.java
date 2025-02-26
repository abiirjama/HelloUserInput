package topic2;


import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        // Example int array
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 100;
        // numbers[5] = 3; // This line will cause an ArrayIndexOutOfBoundsException

        // Example String array
        String[] classNames = { "Java", "Web", "Android", "iOS" };
        classNames[0] = "Java";

        // Print one of the class names
        System.out.println("One of the second year classes is " + classNames[2]);

        // Print the number of classes
        int numberOfClasses = classNames.length;
        System.out.println("There are " + numberOfClasses + " classes.");

        // Print all the class names using a for loop
        for (int x = 0; x < classNames.length; x++) {
            System.out.println("A class name is " + classNames[x]);
        }

        // Print the class names as a string representation of the array
        System.out.println(Arrays.toString(classNames));

        // Declare a new String array with 4 elements
        String[] className = new String[4];
    }
}
