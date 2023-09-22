package exercise1;

import static java.lang.Math.*;

public class Math3 {
    public static double areaOfCircle( int a){
        double b = PI * a * a;
        return b;
    }
    public static double perimeterOfCircle(int a){
        double b =  (2 * PI * a);
        return b;
    }
    public static void main(String[] args){
       System.out.println( areaOfCircle(3));
        System.out.println( perimeterOfCircle(3));
    }
}
