package ch4;


import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get sides from user
        System.out.print("Enter first side: ");
        double side1 = input.nextDouble();

        System.out.print("Enter second side: ");
        double side2 = input.nextDouble();

        System.out.print("Enter third side: ");
        double side3 = input.nextDouble();

        // Check if the sides can form a triangle
        if (isTriangle(side1, side2, side3)) {
            System.out.println("The sides can form a triangle!");
        } else {
            System.out.println("The sides cannot form a triangle.");
        }

        input.close();
    }

    // Method to check the triangle inequality theorem
    public static boolean isTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
