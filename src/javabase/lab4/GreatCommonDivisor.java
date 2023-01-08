package javabase.lab4;

import java.util.Scanner;

public class GreatCommonDivisor {
    public static int gcd(int a, int b) {
        int temp;
        if (a < b) {
            swap(a, b);
        }
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter a number2: ");
        int number2 = sc.nextInt();
        sc.close();
        System.out.printf("gcd(%d, %d) = %d", number1, number2, gcd(number1, number2));
    }
}
