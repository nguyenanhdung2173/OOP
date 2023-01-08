package javabase.homework1;

import java.util.Scanner;

public class Oct2Dec {
    public static boolean isOct(String s) {
        s = s.toLowerCase();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '7')) return false;
        }

        return true;
    }

    public static int toOctDigit(char ch){
        final String octStr = "01234567";
        return octStr.indexOf(ch);
    }

    public static int convertOctToDec(String s) {
        int size = s.length();
        int decimalValue = 0;
        for (int i = 0; i < size; i++) {
            decimalValue = decimalValue * 8 + toOctDigit(s.charAt(i));
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Octal string: ");
        String s = sc.nextLine();

        if (isOct(s)) {
            System.out.printf("The equivalent decimal number \"%s\" is " + convertOctToDec(s), s);
        } else {
            System.out.printf("error: invalid octal string \"%s\"", s);
        }

    }
}
