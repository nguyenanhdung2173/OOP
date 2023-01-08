package javabase.lab4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        if (array == null) {
            return;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (array[j] < array[j-1]) {
                    swap(array, j, j - 1);
                }
             }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void shuffle(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int j = rand.nextInt(array.length - 1);
            swap(array, i, j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        shuffle(array);
        // before
        System.out.println(Arrays.toString(array));
        // after
        System.out.println("Array sort: ");
        bubbleSort(array);
    }
}
