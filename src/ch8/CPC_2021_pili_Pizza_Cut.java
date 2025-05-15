package ch8;
import java.util.Scanner;

/*
Maximum number of slice in a pizza but Remember no Intersect point of three line at one point

formula is CFG Number of slice={n(n+1)/2}+1;
Recureence relaton; Ln=L(n-1)+n;
 */
class ICPC_2021_pili_Pizza_Cut {

    public static void main(String[] args) {
        int number_of_line;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The number of Line ");
        number_of_line=sc.nextInt();
        System.out.println("Number Of Slice "+ Slice(number_of_line));
    }

    public static int Slice(int line){

        if(line==0){
            return 1;

        }
        else {
            return  Slice(line-1)+line;
        }
    }



}