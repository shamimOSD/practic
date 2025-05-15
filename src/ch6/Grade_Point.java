package ch6;
//Ex-6.28

import java.util.Scanner;

public class Grade_Point {
    public static int quality_point(int num){


        if(num>=90&& num<=100){
            return 4;
        } else if (num>=80&&num<=89) {
            return 3;
        }
        else if(num>=70&& num<=79){
            return 2;
        }
        else if(num>=60 && num <=69){
            return 1;
        }
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        System.out.println("Your grade is "+quality_point(number));

    }
}