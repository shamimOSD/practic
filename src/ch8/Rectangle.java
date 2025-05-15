package ch8;

/*
   8.4  (Rectangle Class) Create a class Rectangle with attributes length and width, each of which
   defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and
   get methods for both length and width. The set methods should verify that length and width are each
   floating-point numbers larger than 0.0 and less than 20.0.Write a program to test class Rectangle.

 */
import java.util.Scanner;

public class Rectangle {
    double length;
    double width = 1.0;
    public  Rectangle(){
        this.length=1.0;
        this.width=1.0;

    }



    //Remember no return type in constructor.



    public  Rectangle(Double a,Double b){
        setWidth(b);
        setLength(a);
    }
    public void setLength(double length) {
        if(length>0.0 && length <20.0){
            this.length = length;
        }
        else {
            System.out.println("Length must be getter than 0 and less then 20");
        }
    }

    public void setWidth(double width) {
        if (width>0.0 && width <20.0){
            this.width = width;
        }
        else {
            System.out.println("Width Must be Gatter then 0 and less than 20");
        }
    }
    public double Perimeter (){
        return 2*(length+width);
    }
    public double Area(){
        return (length*width);
    }

    public static void main(String[] args) {
        Rectangle R=new Rectangle();
        Scanner sc=new Scanner(System.in);
        double a,b;
        System.out.println("Enter length and width");
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("IF I called default Constactor then Primeter is "+ R.Perimeter()+" and the Area Is "+R.Area());
        R.setLength(a);
        R.setWidth(b);
        System.out.println("After set value perimeter is "+R.Perimeter()+"And Area Is "+R.Area());
        Rectangle Rc=new Rectangle(a,b);
        System.out.println("Parameter Constructor Area is "+Rc.Area()+"  and perimeter is "+Rc.Perimeter());
    }
}

