package ch8;
import java.util.Scanner;

public class ComplexNumber {
    private int real;
    private int imaginary;

    // Getters and setters
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    // Method to return the string representation of the complex number
    public String complexNumber() {
        if (imaginary < 0) {
            return String.format("%d - %di", real, Math.abs(imaginary));
        } else {
            return String.format("%d + %di", real, imaginary);
        }
    }

    // Method to add two complex numbers and return a new object
    public ComplexNumber calculator1(ComplexNumber ob1, ComplexNumber ob2) {
        ComplexNumber ob3 = new ComplexNumber();
        ob3.setReal(ob1.getReal() + ob2.getReal());
        ob3.setImaginary(ob1.getImaginary() + ob2.getImaginary());
        return ob3;
    }
    public ComplexNumber calculator2(ComplexNumber ob1, ComplexNumber ob2) {
        ComplexNumber ob3 = new ComplexNumber();
        ob3.setReal(ob1.getReal() - ob2.getReal());
        ob3.setImaginary(ob1.getImaginary() - ob2.getImaginary());
        return ob3;
    }
    // Main method to test the class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Complex Number Input
        System.out.println("Enter real and imaginary parts for first complex number (a + bi):");
        ComplexNumber cm = new ComplexNumber();
        cm.setReal(sc.nextInt());
        cm.setImaginary(sc.nextInt());

        System.out.println("The first Complex Number is: " + cm.complexNumber());

        // Second Complex Number Input
        System.out.println("Enter real and imaginary parts for second complex number (c + di):");
        ComplexNumber ob1 = new ComplexNumber();
        ob1.setReal(sc.nextInt());
        ob1.setImaginary(sc.nextInt());

        System.out.println("The second Complex Number is: " + ob1.complexNumber());

        // Adding the two complex numbers
        ComplexNumber ob2 = cm.calculator1(cm, ob1);
        System.out.println("The result of addition is: " + ob2.complexNumber());
        ob1=cm;
        ComplexNumber ob3 = cm.calculator2(cm, ob1);


        System.out.println("The result of Sub is: " + ob3.complexNumber());

        System.out.println(ob1.complexNumber());

        sc.close();
    }
}