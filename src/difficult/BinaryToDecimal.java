package difficult;

public class BinaryToDecimal {
    public static int convertBinaryToDecimal(String binary) {
        int sum = 0;
        int pow = 0;
        for (int i = binary.length() - 1; i >= 0; i--, pow++) {
            int digit = binary.charAt(i) - '0';
            sum = sum + (digit * (int) Math.pow(2, pow));
        }
        return sum;
    }

    public static void anotherWayToConversion(int binary) {
        int binaryNumber = binary;
        int decimal = 0;
        int pow = 0;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, pow);
            pow++;
            binary = binary / 10;
        }
        System.out.println("For this " + binaryNumber + " Decimal value is " + decimal);
    }


    public static void main(String[] args) {
        int sum = convertBinaryToDecimal("10110");
        System.out.println(sum);
        anotherWayToConversion(10110);
    }


}
