package week4;
import java.util.ArrayList;
import java.util.List;
public class removing {

        public static void main(String[] args) {
            // 1. Create a List and add elements
            List<String> classNames = new ArrayList<>();
            classNames.add("Programming Logic");
            classNames.add("Web Client Server");
            classNames.add("Project Management");
            classNames.add("Info Tech Concepts");

            // Print initial list
            System.out.println("Initial List: " + classNames);
            // Output: [Programming Logic, Web Client Server, Project Management, Info Tech Concepts]

            // 2. Remove element by index (0 = first element)
            classNames.remove(0);
            System.out.println("After removing index 0: " + classNames);
            // Output: [Web Client Server, Project Management, Info Tech Concepts]

            // 3. Replace element at specific index (1 = second element)
            classNames.set(1, "Systems Analysis");
            System.out.println("After setting index 1: " + classNames);
            // Output: [Web Client Server, Systems Analysis, Info Tech Concepts]

            // 4. Check if list contains specific element
            String search = "Systems Analysis";
            if (classNames.contains(search)) {
                System.out.println("The list contains: " + search);
            } else {
                System.out.println("The list does NOT contain: " + search);
            }
            // Output: The list contains: Systems Analysis

            // 5. Check list size and if empty
            System.out.println("List size: " + classNames.size());
            System.out.println("Is list empty? " + classNames.isEmpty());
        }
    }

