package ch6;
import java.util.Scanner;
//EX-6.18 and 6.19
// Connstuct a method that take input from user and print the Square Parttern
public class Square_Pattarn {

    public void Print_parttan(int number_of_row_and_colum,char symbol){

        for(int i=0;i<number_of_row_and_colum;i++){

            for(int j=0;j<number_of_row_and_colum;j++){
                System.out.print(" "+symbol+" ");
            }
            System.out.print("\n"); // no new line Print
        }


    }

    public static void main(String[] args) {
        Square_Pattarn print=new Square_Pattarn();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row=sc.nextInt();
        System.out.println("Enter The Char");
        char symbol=sc.next().charAt(0);  // Read a string and take the first character
        print.Print_parttan(row,symbol);
    }

}