package topic2;

public class ClassNames {
    public static void main(String[] args) {
        // Declare and initialize a String array with 3 elements
        String[] classNames = new String[3];
        classNames[0] = "Java";
        classNames[1] = "MySQL";
        classNames[2] = "Project Management";

        // Alternatively, you can initialize the array directly
        // String[] classNames = { "Java", "MySQL", "Project Management" };

        // Add a fourth element to the array
        String[] updatedClassNames = { "Java", "MySQL", "Project Management", "Career Prep" };

        // Loop through the updatedClassNames array and print each class name
        for (int c = 0; c < updatedClassNames.length; c++) {
            System.out.println(updatedClassNames[c]);
        }
    }
}
