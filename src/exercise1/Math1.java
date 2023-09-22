package exercise1;

public class Math1 {
    public static void math_a(int a, int b, int c){
        float d = -a + b * c;
        System.out.println("The 1st result is : " + d );
    }
    public static void math_b(int a, int b, int c){
        float d = (a + b) % c;
        System.out.println("the 2nd result is : " + d);
    }
    public static void math_c(int a, int b, int c, int d){
        float e = a + b * c /d;
        System.out.println("The 3 rd result is : " + e);
    }
    public static void math_d(int a, int b, int c, int d, int e, int f){
        float g = a + b / c * d - e % f;
        System.out.println("The 4th result is : " + g);
    }
    public static void main(String[] args){
        math_a(5,8,6);
        math_b(55, 9,9);
        math_c(20, -3, 5, 8);
        math_d(5,15,3, 2,8,3);
    }
}
