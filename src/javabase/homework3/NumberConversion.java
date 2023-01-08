package javabase.homework3;

import java.util.Scanner;

public class NumberConversion {
    static final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";

    public static int toDecima(String in, int radix) {
        in.toLowerCase();
        int decimalValue = 0;
        for (int i = 0; i < in.length(); i++) {
            decimalValue = decimalValue * radix + Character.digit(in.charAt(i), radix);
        }

        return decimalValue;
    }

    public static String toRadix(int number, int radix) {
        StringBuilder result = new StringBuilder();
        if (radix == 0) return result.toString();

        char tmp;
        while (number > 0) {
            tmp = alphabet.charAt(number % radix);
            result.append(tmp);
            number /= radix;
        }
        return result.reverse().toString();
    }


    public static String toRadix(String in, int radix, int outRadix) {
        if (radix == outRadix) return in;

        return toRadix(toDecima(in, radix), outRadix);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and radix: ");
        String inStr = sc.nextLine();
        System.out.println("Enter the input radix: ");
        int radix = sc.nextInt();
        System.out.println("Enter the output radix: ");
        int outRadix = sc.nextInt();

        System.out.printf("\"%s\" in radix %d is \" %s\" in radix %d", inStr, radix, toRadix(inStr, radix, outRadix), outRadix);
    }
}
