package javabase.homework1;

import java.util.Scanner;

public class TestPalindromicWord {

    public static boolean checkPalindromicWords(String s) {
        String tmp = "";
        s = s.toLowerCase();
        for (int charIdx = s.length() - 1; charIdx >= 0; charIdx--) {
            tmp += s.charAt(charIdx);
        }
        if (tmp.equals(s))
            return true;

        return false;
    }

    public static boolean checkPalindromicPhrase(String s) {
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String s = sc.nextLine();

        System.out.println(checkPalindromicWords(s));
    }
}
