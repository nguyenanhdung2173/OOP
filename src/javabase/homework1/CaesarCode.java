package javabase.homework1;

import java.util.Scanner;

public class CaesarCode {
    public static String getCaesarCode(String s){
        StringBuilder result = new StringBuilder();
        s = s.toUpperCase();

        for (int idx = 0; idx < s.length(); idx++) {
            if (s.charAt(idx) >= 'A' && s.charAt(idx) <= 'W') {
                result.append((char) (s.charAt(idx) + 3));
            } else if (s.charAt(idx) == 'X') {
                result.append('A');
            } else if (s.charAt(idx) == 'Y') {
                result.append('B');
            } else {
                result .append('C');
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a plaintext string: ");
        String s = sc.next();

        System.out.println("The ciphcrtext string is: " + getCaesarCode(s));
    }
}
