package javabase.homework1;

import java.util.Scanner;

public class HillPattern {
    public static void printHillPatternA(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if (col +  row >= size + 1 && row >= col - size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printHillPatternB(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if (row <= col && 2 * size - row >= col){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printHillPatternC(int size){
        int numRows = 2 * size - 1;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numRows; col++) {
                if (row + col >= size + 1 && row + size - 1 >= col &&
                        row - size + 1 <= col && row + col <= numRows + size){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printHillPatternD(int size){
        int numRows = 2 * size - 1;
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numRows; col++) {
                if (row + col > size + 1 && row + size - 1 > col &&
                        row - size + 1 < col && row + col < numRows + size){
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        printHillPatternA(size);
        System.out.println();
        printHillPatternB(size);
        System.out.println();
        printHillPatternC(size);
        System.out.println();
        printHillPatternD(size);
    }
}
