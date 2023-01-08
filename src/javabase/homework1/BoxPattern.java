package javabase.homework1;

import java.util.Scanner;

public class BoxPattern {
    public static void printBoxPatternA(int size){
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public  static void printBoxPatternB(int size){
        for (int row  = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row == 1|| row == size || row == col){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public  static void printBoxPatternC(int size){
        for (int row  = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row == 1|| row == size || row + col ==  size + 1){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public  static void printBoxPatternD(int size){
        for (int row  = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row == 1|| row == size || row == col || row + col == size + 1){
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
        System.out.println("Enter the size: ");
        int size =  sc.nextInt();

        System.out.println("Pattern A:");
        printBoxPatternA(size);
        System.out.println("Pattern B:");
        printBoxPatternB(size);
        System.out.println("Pattern C:");
        printBoxPatternC(size);
        System.out.println("Pattern D:");
        printBoxPatternD(size);
    }
}
