package javabase.homework1;

import java.util.Scanner;

public class TestPalindromicPhrase {
    public static boolean checkPalindromicPhrase(String str) {
        int frontIdx = 0;
        int backIdx = str.length() - 1;

        String phrase = str.toLowerCase();
        boolean checker = true;
        while (!Character.isLetter(phrase.charAt(frontIdx)) && frontIdx < backIdx) {
            ++frontIdx; // jump to the first letter
        }
        while (!Character.isLetter(phrase.charAt(backIdx)) && backIdx > 0) {
            --backIdx; // jump to the first letter
        }
        while (true) {
            if (frontIdx >= backIdx) {
                break;
            }
            if (phrase.charAt(frontIdx) == phrase.charAt(backIdx)) {
                do { // jump to the next letter
                    ++frontIdx;
                } while (!Character.isLetter(phrase.charAt(frontIdx)));
                do { // jump to the next letter
                    --backIdx;
                } while (!Character.isLetter(phrase.charAt(backIdx)));
            } else {
                checker = false;
                break;
            }
        }
        return checker;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phrase : ");
        String phrase = sc.nextLine();

        if (checkPalindromicPhrase(phrase)) {
            System.out.printf(" %1$s is palindrome.\n ", phrase);
        } else {
            System.out.printf(" %1$s is not palindrome.\n ", phrase);
        }
    }
}
