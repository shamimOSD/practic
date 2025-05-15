package ch4;
import java.util.Scanner;

public class EncryptData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = input.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Invalid input. Please enter exactly a 4-digit number.");
            return;
        }

        // Extract digits
        int d1 = (number / 1000) % 10; // First digit
        int d2 = (number / 100) % 10;  // Second digit
        int d3 = (number / 10) % 10;   // Third digit
        int d4 = number % 10;          // Fourth digit

        // Step 1: Add 7 to each digit and take remainder mod 10
        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;

        // Step 2: Swap first with third, and second with fourth
        int temp = d1;
        d1 = d3;
        d3 = temp;

        temp = d2;
        d2 = d4;
        d4 = temp;

        // Display encrypted number
        System.out.println("Encrypted number: " + d1 + d2 + d3 + d4);

        input.close();
    }
}
