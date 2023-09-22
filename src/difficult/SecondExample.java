package difficult;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SecondExample {
    public static void main(String[] args) {
//        for (int i = 10; i >= 1 ; i--) {
//            System.out.println(i);
//        }
//        for (int i = 2; i <= 10; i += 2){
//            System.out.println(i);
//           int k = ++i;
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the number that you are multiplying");
        int number = sc.nextInt();
        System.out.println("Print how many multiplication you want you");
        int n = sc.nextInt();
        multiplyNumbers(number, n);
    }

    public static void multiplyNumbers(int number, int n) {
        for (int i = 1; i <= n; i++) {
            int multiple = number * i;
            System.out.println(multiple);
        }
    }


}




