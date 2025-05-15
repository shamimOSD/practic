package ch6;

import java.util.Random;
import java.util.Scanner;

// Enum for Dice faces
enum DiceFace {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);

    private final int value;

    DiceFace(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    // Method to get a random dice face
    public static DiceFace getRandomDiceFace() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

public class DiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for player's name
        System.out.print("Enter your name: ");
        String playerName = input.nextLine();

        // Roll the dice twice
        DiceFace die1 = DiceFace.getRandomDiceFace();
        DiceFace die2 = DiceFace.getRandomDiceFace();

        // Calculate the sum of dice rolls
        int sum = die1.getValue() + die2.getValue();

        // Display the results
        System.out.println(playerName + ", you rolled a " + die1.getValue() + " and a " + die2.getValue() + ".");
        System.out.println("Your total is: " + sum);

        // Determine if the player wins
        if (sum == 7 || sum == 11) {
            System.out.println("Congratulations " + playerName + "! You win!");
        } else {
            System.out.println("Sorry " + playerName + ", you lose. Better luck next time!");
        }

        input.close();
    }
}

