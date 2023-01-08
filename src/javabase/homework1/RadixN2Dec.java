package javabase.homework1;

import java.util.Scanner;

public class RadixN2Dec {
    public static boolean isValidRadixN(String radixString, int radix) {
        radixString = radixString.toLowerCase();
        int size = radixString.length();
        for (int i = 0; i < size; i++) {
            if ((Character.digit(radixString.charAt(i), radix) > 0)) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static int toRadixDigit(char ch, int radix) {
        return Character.digit(ch, radix);
    }

    public static int convertRadixNToDec(String radixString, int radix) {
        int decimalValue = 0;
        radixString = radixString.toLowerCase();
        for (int i = 0; i < radixString.length(); i++) {
            decimalValue = decimalValue * radix + toRadixDigit(radixString.charAt(i), radix);
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radix: ");
        int radix = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string: ");
        String radixString = sc.nextLine();

        if (isValidRadixN(radixString, radix)) {
            System.out.printf("The equivalent decimal number \"%s\" is " + convertRadixNToDec(radixString, radix), radixString);
        } else {
            System.out.printf("error: invalid value %s", radixString);
        }
    }
}
