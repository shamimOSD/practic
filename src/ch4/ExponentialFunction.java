package ch4;

import java.util.Scanner;

public class ExponentialFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for x: ");
        double x = input.nextDouble();

        int terms = 20; // Number of terms to approximate
        double result = 1.0; // Start with 1

        double numerator = 1.0; // x^n
        double denominator = 1.0; // n!

        for (int i = 1; i <= terms; i++) {
            numerator *= x; // x^i
            denominator *= i; // i!
            result += numerator / denominator;
        }

        System.out.println("Estimated value of e^" + x + " is: " + result);

        input.close();
    }
}
