package ch6;

import java.util.Random;

public class RandomNumberGeneration {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomInt = random.nextInt(100); // Range: 0 to 99
        System.out.println("Random integer between 0 and 99: " + randomInt);

        // Generate a random floating-point number between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = random.nextDouble(); // Range: 0.0 to 1.0
        System.out.println("Random double between 0.0 and 1.0: " + randomDouble);

        // Generate a random boolean value (true or false)
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random boolean: " + randomBoolean);
    }
}

