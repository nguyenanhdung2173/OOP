package javabase.lab2;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d: " + printStars(array[i]) + "(%d) \n", i, array[i]);
        }
    }

    public static String printStars(int n) {
        if (n == 0) return "";
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < n; i++) {
            str.append("*");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of items: ");
        int n = sc.nextInt();

        // get input array
        int[] array = new int[n];
        System.out.println("Enter the value of all items : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // print array pattern
        printArray(array);
    }
}
