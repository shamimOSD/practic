package ch6;
import java.util.Scanner;

//  Caclulate math power without using Math class
public class power {
    /*Remember when i call any now static method in static methon then first i have
        to create a objact of this static method in this class
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base Number");
        float base=sc.nextInt();
        System.out.println("Enter the Power Number");
        float power=sc.nextInt() ;

        float answer=1;
        for(int i=1;i<=power;i++){

            answer= (float) (answer*base);
        }
        System.out.println("The Result is "+ answer);
    }
}