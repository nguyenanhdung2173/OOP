package javabase.lab4;

import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int[] array, int key) {
        for (int element :
                array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        if (array == null) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter a number: ");
        int key = sc.nextInt();
        System.out.printf("array contain %d: %b", key, linearSearch(array, key));
        System.out.printf("\nIndex %d in array: %d", key, linearSearchIndex(array, key));
    }
}
