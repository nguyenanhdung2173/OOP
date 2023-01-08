package javabase.lab2;

import java.util.Scanner;

public class Exponent {
    public static int exponent(int base, int exp) {
        int product = 1;
        for (int i = 0; i < exp; i++) {
            product *= base;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exp = sc.nextInt();

        // print result
        System.out.println(base + " raises to the power of " + exp + "" + " is: "
                + exponent(base, exp));
    }
}
