package javabase.lab4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        if (array == null) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                shiftElement(array, i);
            }
        }

        System.out.println(Arrays.toString(array));
    }

    public static void shiftElement(int[] array, int i) {
        int iValue = array[i];
        while ((i > 0) && (array[i - 1] > iValue)) {
            array[i] = array[i-1];
            i--;
        }
        array[i] = iValue;
    }

    public static void swap(int[] array, int i, int j){
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
        insertionSort(array);
    }
}

