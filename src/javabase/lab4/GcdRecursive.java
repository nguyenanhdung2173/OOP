package javabase.lab4;

import java.util.Scanner;

public class GcdRecursive {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nubmer: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.printf("gcd(%d, %d) = %d", number1, number2, gcd(number1, number2));
    }
}
