package ch8;

//8.15
public class Rational_Number {
    private int numerator;
    private int denominator;

    public Rational_Number(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator can not be zero");

        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
        if (this.denominator < 0) {
            this.denominator = -this.denominator;
            this.numerator = -this.numerator;

        }


    }

    public Rational_Number() {
        this(0, 1);

    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    private int gcd(int numerator, int denominator) {
        int common_divisor;
        if (denominator == 0) {
            return numerator;
        } else {
            common_divisor = gcd(denominator, numerator % denominator);
        }
        return common_divisor;
    }
    //8.15 a
    public Rational_Number addition(Rational_Number rationalNumber1, Rational_Number rationalNumber2) {


        int numerator = rationalNumber1.numerator * rationalNumber2.denominator + rationalNumber2.numerator * rationalNumber1.denominator;
        int denominator = rationalNumber1.denominator * rationalNumber2.denominator;
        return new Rational_Number(numerator, denominator);

    }
    //8.15 b
    public Rational_Number subtract(Rational_Number rationalNumber1, Rational_Number rationalNumber2) {
        int numerator = rationalNumber1.numerator * rationalNumber2.denominator - rationalNumber2.numerator * rationalNumber1.denominator;
        int denominator = rationalNumber1.denominator * rationalNumber2.denominator;
        return new Rational_Number(numerator, denominator);
    }
    //8.15 c
    public Rational_Number multiplication(Rational_Number rationalNumber1, Rational_Number rationalNumber2) {
        int numerator = rationalNumber1.numerator * rationalNumber2.numerator;
        int denominator = rationalNumber1.denominator * rationalNumber2.denominator;
        return new Rational_Number(numerator, denominator);

    }
    //8.15 d
    public Rational_Number division(Rational_Number rationalNumber1, Rational_Number rationalNumber2) {
        int numerator = rationalNumber1.numerator * rationalNumber2.denominator;
        int denominator = rationalNumber1.denominator * rationalNumber2.numerator;
        return new Rational_Number(numerator,denominator);


    }
    //8.15 e
    public String display(){
        return numerator+"/"+denominator;
    }
    //8.15 f
    public float display1(){
        return (float) numerator /denominator;
    }
    public static void main(String[] args) {
        Rational_Number rationalNumber1=new Rational_Number(-5,4);
        System.out.println("This is First Rational Number "+rationalNumber1.display());
        System.out.println("This is First Rational Number  "+rationalNumber1.display1());
        Rational_Number rationalNumber2=new Rational_Number(10,20);
        System.out.println("This is Second Rational Number "+rationalNumber2.display());
        System.out.println("This is Second Rational Number "+rationalNumber2.display1());
        Rational_Number rationalNumber3=new Rational_Number();
        rationalNumber3=rationalNumber3.addition(rationalNumber1,rationalNumber2);
        System.out.println("After add "+rationalNumber3.display());
        System.out.println("After add "+rationalNumber3.display1());
        rationalNumber3=rationalNumber3.subtract(rationalNumber1,rationalNumber2);
        System.out.println("After Subracrt "+rationalNumber3.display());
        System.out.println("After Subracrt "+rationalNumber3.display1());
        rationalNumber3=rationalNumber3.multiplication(rationalNumber1,rationalNumber2);
        System.out.println("After Multiplication "+rationalNumber3.display());
        System.out.println("After Multiplication "+rationalNumber3.display1());
        rationalNumber3=rationalNumber3.division(rationalNumber1,rationalNumber2);
        System.out.println("After Division "+rationalNumber3.display());
        System.out.println("After Division "+rationalNumber3.display1());
    }

}