package javabase.lab4;

import java.util.Scanner;

public class SpecialNumber {
    public static String calcSpecialNumber(int n){
        if (n == 1){
            return "1";
        }
        return calcSpecialNumber(n - 1) + numOfDigits(n);
    }

    public static String numOfDigits(int n) {
        return Integer.toString(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nubmer: ");
        int n = sc.nextInt();
        System.out.printf("S(%d) = %s", n, calcSpecialNumber(n));
    }
}
