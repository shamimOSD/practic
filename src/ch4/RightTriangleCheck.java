package ch4;

import java.util.Scanner;

public class RightTriangleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get sides from user
        System.out.print("Enter first side: ");
        double side1 = input.nextDouble();

        System.out.print("Enter second side: ");
        double side2 = input.nextDouble();

        System.out.print("Enter third side: ");
        double side3 = input.nextDouble();

        // Check if they form a right triangle
        if (isRightTriangle(side1, side2, side3)) {
            System.out.println("The sides form a right triangle!");
        } else {
            System.out.println("The sides do not form a right triangle.");
        }

        input.close();
    }

    // Method to check if it satisfies Pythagoras theorem
    public static boolean isRightTriangle(double a, double b, double c) {
        // First, find the largest side (hypotenuse)
        double hypotenuse = Math.max(a, Math.max(b, c));
        double sideA, sideB;

        if (hypotenuse == a) {
            sideA = b;
            sideB = c;
        } else if (hypotenuse == b) {
            sideA = a;
            sideB = c;
        } else {
            sideA = a;
            sideB = b;
        }

        // Check Pythagoras theorem: hypotenuse² = sideA² + sideB²
        return Math.abs((hypotenuse * hypotenuse) - (sideA * sideA + sideB * sideB)) < 0.0001;
        // (using a small tolerance because of floating-point precision)
    }
}
