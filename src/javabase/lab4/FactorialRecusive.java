package javabase.lab4;

import java.util.Scanner;

public class FactorialRecusive {
    public static int factorial(int n){
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.printf("Factorial(%d) is : %d", number, factorial(number));
    }
}
