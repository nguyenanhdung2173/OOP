package javabase.homework1;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static String decipherCeasarCode(String s) {
        StringBuilder result = new StringBuilder();
        s = s.toUpperCase();
        for (int idx = 0; idx < s.length(); idx++) {
            if (s.charAt(idx) >= 'D' && s.charAt(idx) <= 'Z') {
                result.append((char) (s.charAt(idx) - 3));
            } else if (s.charAt(idx) == 'A') {
                result.append('Z');
            } else if (s.charAt(idx) == 'B') {
                result.append('Y');
            } else {
                result.append('X');
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ciphertext string: ");
        String s = sc.next();

        System.out.println("The plaintext string is: " + decipherCeasarCode(s));
    }
}
