package difficult;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        }
        if (n == 2) {
            isPrime = true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

//    public static ArrayList <Integer> listOfPrimeNumBelow(int n) {
//        ArrayList <Integer> prime = new ArrayList <>();
//        for (int num = 2; num <= n; num++) {
//            if (isPrime(num)) {
//                prime.add(num);
//            }
//        }
//        return prime;
//    }

    public static void main(String[] args) {

        printPrimeTill();
    }

    private static void printPrimeTill() {
        for (int i = 1; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
