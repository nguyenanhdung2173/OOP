package javabase.homework1;

import java.util.Scanner;

public class TriangularPattern {

    public static void printTriangularPatternA(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }

    public static void printTriangularPatternB(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1){
                    System.out.print(" #");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printTriangularPatternC(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; ++col) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printTriangularPatternD(int size){
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("Pattern A:");
        printTriangularPatternA(size);
        System.out.println("Pattern B: ");
        printTriangularPatternB(size);
        System.out.println("Pattern C: ");
        printTriangularPatternC(size);
        System.out.println("Pattern D: ");
        printTriangularPatternD(size);
    }
}
