package exercise1;

public class Exercise {
    public static double calculateAverageOfNumbers(int a, int b, int c) {
        double average = (a + b + c) / 3;
        return average;
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(long number) {
        long reverseNumber = 0;
        long originalNumber = number;
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = (int) (number % 10);
            reverseNumber = reverseNumber * 10 + lastDigit;
            number /= 10;
        }
        return originalNumber == reverseNumber;
    }

    public static void main(String[] args) {
//        System.out.println(calculateAverageOfNumbers(2, 3, 4));
//        System.out.println(isEven(9));
        System.out.println(isPalindrome(121));
    }
}
