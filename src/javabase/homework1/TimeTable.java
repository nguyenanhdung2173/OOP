package javabase.homework1;

import java.util.Scanner;

public class TimeTable {

    public static void printTimeTable(int size){
        System.out.printf("%4s |", "*");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d ", i);
        }

        System.out.println();
        for (int i = 0; i <= size ; i++) {
            System.out.printf("-----");
        }

        System.out.println();
        for (int row = 1; row <= size; row++) {
            System.out.printf("%4d |",row);
            for (int col = 1; col <= size ; col++) {
                System.out.printf("%4d ", row*col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        printTimeTable(size);
    }
}
