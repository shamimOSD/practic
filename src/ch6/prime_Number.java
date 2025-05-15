package ch6;
import java.util.Scanner;

//Ex-6.25
public class prime_Number {
    public static boolean isPrime(int num){
        int flag=0;
        int[] check= new int[]{2, 3, 5, 7};
        if(num==2||num==3||num==5||num==7){
            return true;
        }
        else {
            for (int i=0;i<4;i++){

                if (num%check[i]==0){
                    flag=1;
                    break;
                }
            }
        }


        if (flag==1){
            return false;
        }
        else return true;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(isPrime(num)==true){
            System.out.println("Yes this is Prime Number");
        }
        else {
            System.out.println("Sorry This is not prime Number");
        }
        int total=0;
        System.out.println("total prime number in this range");

        for (int i=2;i<num;i++){
            if(isPrime(i)==true){
                total+=1;
                System.out.print(i+",");
                if(total%20==0){
                    System.out.print("\n");
                }
            }
        }
        System.out.println("\nTotal number of prime number is "+ total);
    }
}