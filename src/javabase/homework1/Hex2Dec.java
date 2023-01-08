package javabase.homework1;

import java.util.Scanner;

public class Hex2Dec {

    public static boolean isHex(String s) {
        s = s.toLowerCase();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (!((s.charAt(i) >= '0' && s.charAt(i) <= '9') ||
                    (s.charAt(i) >= 'a' && s.charAt(i) <= 'f')))
                return false;
        }
        return true;
    }

    public static int toHexDigit(char ch) {
        return Character.digit(ch, 16);
    }

    public static int toHexDigit2(char ch) {
        final String HEX_DIGITS = "0123456789abcdef";
        return HEX_DIGITS.indexOf(ch);
    }

    public static int convertHexToDec(String s) {
        s.toLowerCase();
        int decimalValue = 0;
        for (int i = 0; i < s.length(); i++) {
           decimalValue =  decimalValue* 16 + toHexDigit(s.charAt(i));
        }

        return decimalValue;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Hexadecimal string: ");
        String s = sc.nextLine();
        if (isHex(s)) {
            System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is " + convertHexToDec(s), s);
        } else {
            System.out.printf("error: invalid hexadecimal string %s", s);
        }
    }
}
