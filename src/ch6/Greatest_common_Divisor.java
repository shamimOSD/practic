package ch6;


import java.util.Scanner;

public class Greatest_common_Divisor {
    public static int GCD(int num1,int num2)
    {
        while (num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1= sc.nextInt();
        System.out.println("Enter num2");
        int num2= sc.nextInt();
        System.out.println("the largest common divisor is "+GCD(num1,num2));
        System.out.println(4%8);
    }
}