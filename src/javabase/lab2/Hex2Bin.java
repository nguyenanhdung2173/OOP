package javabase.lab2;

import java.util.Scanner;

public class Hex2Bin {
    public static final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"};

    public static boolean isHex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.digit(str.charAt(i), 16) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void convertHexToBin(String str) {
        if (isHex(str)) {
            for (int i = 0; i < str.length(); i++) {
                int digit = Character.digit(str.charAt(i), 16);
                System.out.printf("%1s ", HEX_BITS[digit]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Hexadecimal string: ");
        String str = sc.next();

        System.out.printf("The equivalent binary for hexadecimal \"%s\" is: ", str);
        convertHexToBin(str);
    }
}
