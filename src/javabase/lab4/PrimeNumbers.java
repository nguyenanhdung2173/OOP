package javabase.lab4;

import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int number){
        if (number <= 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printPrimeList(int bound) {
        System.out.println("Please enter the upper bound: " + bound);
        int count = 0;
        for (int i = 1; i <= bound; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.printf("[%d primes found (%.2f%%)]", count, count * 100.0 / bound);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the upper bound: ");
        int bound = sc.nextInt();
        printPrimeList(bound);
    }
}
