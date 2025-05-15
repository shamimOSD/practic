package ch6;
import java.util.Random;

public class RandomNumberInRange {
    public static void main(String[] args) {
        Random random = new Random();

        int lowerBound = 10;  // Set your desired lower bound
        int upperBound = 50;  // Set your desired upper bound

        // Generate a random number in the range [lowerBound, upperBound)
        int randomInRange = random.nextInt(upperBound - lowerBound) + lowerBound;
        System.out.println("Random integer between " + lowerBound + " and " + upperBound + ": " + randomInRange);

        // Generate a random floating-point number in the range [lowerBound, upperBound)
        double randomDoubleInRange = lowerBound + (upperBound - lowerBound) * random.nextDouble();
        System.out.println("Random double between " + lowerBound + " and " + upperBound + ": " + randomDoubleInRange);
    }
}
