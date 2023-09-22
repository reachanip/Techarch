package difficult;

public class DecimalToBinary {
    public static String convertDecimalToBinary(int decimal) {
        String binary = "";
        int quotient = decimal;
        int remainder = 0;
        while (quotient != 0) {
            quotient = decimal / 2;
            remainder = decimal % 2;
            decimal = quotient;
            binary = remainder + binary;
        }
        return binary;
    }

    public static void anotherWayToConvertDecimalToBinary(int decimal) {

    }

    public static void main(String[] args) {
        String binary = convertDecimalToBinary(25);
        System.out.println(binary);
    }
}
