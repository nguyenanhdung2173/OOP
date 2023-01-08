package javabase.homework1;

import java.util.Scanner;

public class Bin2Dec {
    public static boolean isBin(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == '1' || s.charAt(i) == '0')) return false;
        }
        return true;
    }

    public static int convertBinToDec(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                sum += Math.pow(2, s.length() - i - 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary string: ");
        String s = sc.nextLine();
        if (isBin(s)) {
            System.out.printf("The equivalent decimal number for binary %s " + convertBinToDec(s), s);
        } else {
            System.out.printf("Error invalid String \"%s\"", s);
        }
    }
}
