package javabase.lab4;

import java.util.Scanner;

public class PerfectNumberList {
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }

        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum < aPosInt;
    }

    public static void printListPerfect(int bound) {
        int count = 0;
        for (int i = 2; i < bound; i++) {
            if (isPerfect(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]", count, count * 100.0 / bound);
    }

    public static void printListDeficientAndNorPerfect(int bound) {
        int count = 0;
        for (int i = 2; i < bound; i++) {
            if (!isDeficient(i) && !isPerfect(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%%)]", count, count * 100.0 / bound);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper bound :");
        int bound = sc.nextInt();
        System.out.println("These numbers are perfect: ");
        printListPerfect(bound);
        System.out.println("These numbers are neither deficient nor perfect: ");
        printListDeficientAndNorPerfect(bound);
    }
}
