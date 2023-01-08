package javabase.lab2;

import java.util.Scanner;

public class ArrayToString {
    public static String arrayToString(int[] array) {
        assert array != null;
        int size = array.length;

        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size - 1; i++) {
            str.append(array[i]).append(", ");
        }
        str.append(array[array.length - 1]).append( "]");

        return str.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of items: ");
        int n = sc.nextInt();

        // creat array
        int[] array = new int[n];
        System.out.print("Enter the value of items: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array: " + arrayToString(array));
    }
}
