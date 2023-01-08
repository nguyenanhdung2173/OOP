package javabase.lab2;

import java.util.Scanner;

public class PrintArray {
    public static String printArray(int[] array) {
        StringBuffer str = new StringBuffer();
        str.append("[");
        for (int i = 0; i < array.length - 1; i++) {
            str.append(array[i] + ", ");
        }
        str.append(array[array.length - 1] + "]");

        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = sc.nextInt();

        // get input array
        int[] array = new int[n];
        System.out.println("Enter the value of all items: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // print array
        System.out.println("The values are: " + printArray(array));
    }
}
