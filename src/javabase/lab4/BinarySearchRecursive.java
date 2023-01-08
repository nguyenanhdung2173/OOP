package javabase.lab4;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static boolean binarySearch(int[] array, int key, int frontIdx, int backIdx) {
        if (frontIdx == backIdx - 1) {
            if (key == array[frontIdx]) {
                return true;
            } else {
                return false;
            }
        } else {
            int midIdx = (frontIdx + backIdx) / 2;
            if (key == array[midIdx]) {
                return true;
            } else if (key < array[midIdx]) {
                backIdx = midIdx;
            } else {
                frontIdx = midIdx + 1;
            }
        }
        return  binarySearch(array, key, frontIdx, backIdx);
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
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

        System.out.printf("Array contain key %d : %b",key,binarySearch(array, key));
    }
}
