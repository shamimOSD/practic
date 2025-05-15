package ch6;

/*
 Ex-6.21
displays it as a sequence of digits, separating
        each pair of digits by two spaces */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Number_split {
    public void split(int num){
        ArrayList<Integer>Number=new ArrayList<>();
        while(num>0){
            Number.add(num%10);
            num=num/10;

        }
        Collections.reverse(Number);
        for(int digit:Number){
            System.out.print(digit+" ");
        }
    }

    public static void main(String[] args) {
        Number_split ns=new Number_split();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println("Output is");
        ns.split(num);
    }
}