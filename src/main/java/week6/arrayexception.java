package week6;
import java.util.List;
import java.util.Random;
public class arrayexception {
    public static void main(String[] args) {
            // Fixed array example
            String[] classNames = {"Web", "Java", "C#"};

            // Corrected .Length to .length and added bounds checking
            for (int i = 0; i < classNames.length; i++) {
                System.out.println(classNames[i]);
            }

            // Fixed list example
            List<Integer> classCodes = List.of(2568, 2545, 2595);

            // Added bounds checking for list
            for (int i = 0; i < classCodes.size() && i < 5; i++) {
                System.out.println(classCodes.get(i));
            }

            // Fixed random number example
            Random rnd = makeRandomNumberGenerator();
            if (rnd != null) {  // Null check added
                System.out.println("Random number: " + getRandomNumber(rnd));
            }
        }

        public static Random makeRandomNumberGenerator() {
            return new Random(); // Now properly returns a Random instance
        }

        public static int getRandomNumber(Random rnd) {
            // Added null safety
            return rnd != null ? rnd.nextInt(10) : -1;
        }
    }

