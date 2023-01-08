package javabase.lab2;

import java.util.Scanner;

public class ArrayEquals {
    public static boolean equals(int[] array1, int[] array2) {
        assert array1 != null && array2 != null;
        // check length both array
        if (array1.length != array2.length) return false;
        // check element in both array
        int size = array1.length;
        for (int i = 0; i < size; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number of items: ");
            int n = sc.nextInt();

            // creat array1,  with size n
            int[] array1 = new int[n];
            System.out.print("Enter the value of items in array1: ");
            for (int i = 0; i < n; i++) {
                array1[i] = sc.nextInt();
            }

            // creat array2 with size m
            System.out.print("Enter a number of items");
            int m = sc.nextInt();
            int[] array2 = new int[m];
            System.out.print("Enter the value of items in array2: ");
            for (int i = 0; i < m; i++) {
                array2[i] = sc.nextInt();
            }

            System.out.println("Check two array: " + equals(array1, array2));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
