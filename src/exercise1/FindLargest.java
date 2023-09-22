package exercise1;

public class FindLargest {
    public static int largest(int a, int b, int c){
        int largest;
        if (a > b && a > c) {
            largest = a;
        }else if ( b > a && b > c){
            largest = b;
        }else {
            largest = c;
        }
        return largest;
    }
    public static void main (String[]args){
        System.out.println(largest(3,7,2));
    }
}
