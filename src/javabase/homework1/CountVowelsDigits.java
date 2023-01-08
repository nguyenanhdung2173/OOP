package javabase.homework1;

import java.util.Scanner;

public class CountVowelsDigits {

    public static int countVowels(String s){
        int count = 0;
        s = s.toLowerCase();
        String vowels = "oaiue";
        for (int j = 0; j < vowels.length(); j++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == vowels.charAt(j)) count++;
            }
        }
        return count;
    }

    public static int countDigits(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '1' && s.charAt(i) <= '9') count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();

        System.out.printf("Number of vowels: %d (%.2f%%) \n", countVowels(s), countVowels(s) * 100.0 / s.length());
        System.out.printf("Number of digits: %d (%.2f%%)", countDigits(s), countDigits(s) * 100.0 / s.length());
    }
}
