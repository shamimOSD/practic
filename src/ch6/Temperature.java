package ch6;

//   c/5=(f-32)/9=(k-273)/5

import java.util.Scanner;

public class Temperature {

    public double calCelcius(float Fahrenheit ){

        return ((Fahrenheit-32)*5)/9;
    }
    public double calFahrenheit(float Celcius){
        double F=((Celcius/5)*9)+32;
        return F;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Temperature t=new Temperature();
        System.out.println("Enter The Temparature");
        float input = sc.nextFloat();
        System.out.println("Enter The Extention");
        char ex=sc.next().charAt(0);
        if (ex=='F'|| ex=='f')
        {
            System.out.println(input +" "+ ex +" is "+t.calCelcius(input)+" C" );
        }
        else if(ex=='c'||ex=='C') {
            System.out.println(input +" "+ ex +" is "+t.calFahrenheit(input)+" F" );
        }
        else {
            System.out.println("Invalid Extention");
        }
    }
}