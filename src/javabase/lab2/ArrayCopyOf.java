package javabase.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyOf {
    public static int[] copyOf(int[] array) {
        assert array != null;

        int size = array.length;
        // creat a new array
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        assert array != null;

        int size = array.length;
        // creat a new array with size new length
        int[] newArray = new int[newLength];
        if (newLength <= size) {
            for (int i = 0; i < newLength; i++) {
                newArray[i] = array[i];
            }
        } else {
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
        }
        return newArray;
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

            // read a newlength need copy
            System.out.print("Enter the new length: ");
            int newLenght = sc.nextInt();

            System.out.println("array copy is : " + Arrays.toString(copyOf(array, newLenght)));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
