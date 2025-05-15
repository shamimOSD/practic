import java.util.Scanner;

public class Main {

    public static void CheckAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Access Denied your age:" + age);
        }
    }

    public static void main(String[] args) {
        //1
        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result=" + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception:" + e);
        } catch (Exception e) {
            System.out.println("Exception=" + e);
        }
        System.out.println("Last Line of Program");

        //2
        try {
            int x = 5;
            int y = 0;
            int result = x / y;
            System.out.println("Result2:" + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndex Exception:" + e);
        } finally {
            System.out.println("Last Line of program");
        }

        //3
        try {
            int[] a = new int[4];
            a[4] = 10;
        } catch (ArithmeticException e1) {
            System.out.println("ArithmeticException:" + e1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("ArrayIndexOutOfBoundException:" + e2);
        } catch (Exception e3) {
            System.out.println("Exception" + e3);
        }

        //4 (fixed with break)
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Please enter num1:");
                int num1 = input.nextInt();
                System.out.println("Please enter num2:");
                int num2 = input.nextInt();
                int result = num1 / num2;
                System.out.println("Result:" + num1 + "/" + num2 + "=" + result);
                break; // exit after successful division
            } catch (Exception e) {
                System.out.println("Exception:" + e);
                System.out.println("You must enter valid integers, please try again.");
                input.nextLine(); // clear invalid input
            }
        }

        // Now this code is reachable
        try {
            CheckAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error ocar " + e.getMessage());
        }
    }
}
