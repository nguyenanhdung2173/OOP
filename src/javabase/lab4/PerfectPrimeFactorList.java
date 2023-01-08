package javabase.lab4;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static boolean isProductOfPrimeFactors(int number) {
        int product = 1;
        for (int i = 2; i < number; i++) {
            if (isPrime(i) && (number % i == 0)) {
                product *= i;
            }
        }
        return product == number;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
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

    public static void printProductOfPrimeFactor(int bound){
        System.out.println("Enter the upper bound: " + bound);
        int count = 0;
        for (int i = 0; i <= bound; i++) {
            if (isProductOfPrimeFactors(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, count * 100.0 / bound);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bound = sc.nextInt();
        printProductOfPrimeFactor(bound);
        sc.close();
    }
}
