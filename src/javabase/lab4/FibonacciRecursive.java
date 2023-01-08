package javabase.lab4;

import java.util.Scanner;

public class FibonacciRecursive {
    public static int calcFibonacci(int number){
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return calcFibonacci(number - 1) + calcFibonacci(number - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.printf("Fibonacci(%d) is: %d", number, calcFibonacci(number));
    }
}
