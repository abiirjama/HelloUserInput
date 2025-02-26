package topic2;

public class Distances {
    public static void main(String[] args) {
        // Array of distances in miles
        double[] miles = { 1, 4, 10 }; // Some example distances

        // Array to store the corresponding distances in kilometers
        double[] kilometers = new double[miles.length];

        // Convert miles to kilometers
        for (int x = 0; x < miles.length; x++) {
            double km = miles[x] * 1.6; // 1 mile is approximately 1.6 kilometers
            kilometers[x] = km; // Store the converted value in the kilometers array
        }

        // Print the converted distances
        for (int x = 0; x < miles.length; x++) {
            System.out.println(miles[x] + " miles is equal to " + kilometers[x] + " kilometers");
        }
    }
}
