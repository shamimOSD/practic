package ch6;

import java.util.Scanner;
//Check two Number who is multiple by another number or not
public class Multiple_Check {
    public boolean isMultiple(int a,int b){

        if(a%b==0){
            return true;
        }
        else return false;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        Multiple_Check mc=new Multiple_Check();

        if(mc.isMultiple(a,b)==true){
            System.out.println(a +" is multiple of "+b);
        }
        else {
            System.out.println(a+" IS not Multiple of "+b);
        }
    }


}