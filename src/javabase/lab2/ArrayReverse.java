package javabase.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
            swap(array, i, j);
        }

        //System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number of items: ");
            int n = sc.nextInt();

            // creat array with size n
            int[] array = new int[n];
            System.out.print("Enter the value of items in array1: ");
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            reverse(array);
            System.out.println("array reverse is : " + Arrays.toString(array));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
