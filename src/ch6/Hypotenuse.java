package ch6;

import java.util.Scanner;

/* EX_6_15  Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given.
 The method should take two arguments of type double and return the hypotenuse as a
  double.
  Incorporate this method into an application that reads values for side1 and side2
   and performs the calculation with the hypotenuse method.
   Use Math methods pow and sqrt to determine the length of the hypotenuse for each
    of the triangles in Fig. 6.15.
     [Note: Class Math also provides method hypot to perform this calculation.]
 */
class Hypotenuse {
    public  double calHypotenuse(double a,double b){
        double p=  (Math.pow(a,2.0)+Math.pow(b,2.0));
        double answer=Math.sqrt(p);
        return  answer;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hypotenuse ob=new Hypotenuse();
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("The answer is : "+ob.calHypotenuse(a,b));
    }


}