package week4;
import java.util.ArrayList;
import java.util.List;
public class lists {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> arrayList = new ArrayList<>();

        // Add elements to the list
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Clara");
        arrayList.add("MCTC");

        // Get the first element (index 0)
        String firstWord = arrayList.get(0);

        // Loop through each element in the list
        for (String s : arrayList) {
            System.out.println(s);              // Print original string
            System.out.println(s.toUpperCase()); // Print uppercase version
            System.out.println(s.length());    // Print string length
        }
    }
}
