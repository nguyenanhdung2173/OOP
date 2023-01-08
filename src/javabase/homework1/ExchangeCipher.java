package javabase.homework1;

import java.util.Scanner;

public class ExchangeCipher {

    public static String getCipherText(String s) {
        StringBuilder result = new StringBuilder();
        s = s.toUpperCase();
        for (int idx = 0; idx < s.length(); idx++) {
            result.append((char) ('A' + 'Z' - s.charAt(idx)));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a plaintext string: ");
        String s = sc.next();

        System.out.println("The ciphertext string is: " + getCipherText(s));
    }
}
