package exercise1;

public class Math2 {
    public static void sum(int a, int b){
        int c = a + b;
        System.out.println("Sum is : " + c);
    }
    public static void multiplication(int a, int b){
        int c = a * b;
        System.out.println("Multiplication is : " + c);
    }
    public static void subtraction(int a, int b){
        int c = a - b;
        System.out.println("subtraction is : " + c);
    }
    public static void division(int a , int b){
        float c = a / b;
        System.out.println("division is : " + c);
    }
    public static void remainder(int a, int b){
        int c = a % b;
        System.out.println("remainder is : " + c);
    }
    public static void main(String[] args){
        sum(22,11);
        multiplication(22, 11);
        subtraction(22, 11);
        division(22, 11);
        remainder(22,11);
    }
}
