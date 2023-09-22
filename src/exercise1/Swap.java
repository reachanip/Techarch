package exercise1;

public class Swap {
    public static void swap(int a , int b){
        int temp = 0;
       temp = a;
       a = b;
       b = temp;
       System.out.println(a +" "+ b);
    }
    public static void main(String[] args){
        swap(7,9);
    }
}
