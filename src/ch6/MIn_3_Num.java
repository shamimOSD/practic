package ch6;

import java.util.Scanner;

// EX-6.23
public class MIn_3_Num {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter the number");
        a=sc.nextFloat();
        System.out.println("Enter the number");
        b=sc.nextFloat();
        System.out.println("Enter the number");
        c=sc.nextFloat();
        System.out.println("The smallest Nunmber is "+Math.min(Math.min(a,b),c));

        //Math.min always compare two num and return the minimum number

    }
}