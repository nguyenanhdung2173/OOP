package javabase.homework1;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void printKeypadDigits(String s){
        s = s.toLowerCase();
        int size = s.length();

        for (int idx = 0; idx < size; idx++) {
            char c = s.charAt(idx);
            switch (c){
                case 'a','b','c' -> System.out.print("2");
                case 'd', 'e','f' -> System.out.print("3");
                case 'g', 'h','i' -> System.out.print("4");
                case 'j', 'k', 'l' -> System.out.print("5");
                case 'm', 'n', 'o' -> System.out.print("6");
                case 'p', 'q', 'r' -> System.out.print("7");
                case 't', 'u', 'v' -> System.out.print("8");
                case 'w', 'x', 'y', 'z' -> System.out.print("9");
                default -> System.out.print(s.charAt(idx));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();

        System.out.println("keypad digits: ");
        printKeypadDigits(s);
    }
}
