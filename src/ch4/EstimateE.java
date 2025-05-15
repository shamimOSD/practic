package ch4;
public class EstimateE {
    public static void main(String[] args) {
        int terms = 20; // Number of terms to use (higher = more accurate)
        double e = 1.0; // Start with 1

        double factorial = 1.0;

        for (int i = 1; i <= terms; i++) {
            factorial *= i; // i!
            e += 1.0 / factorial;
        }

        System.out.println("Estimated value of e using " + terms + " terms: " + e);
    }
}
