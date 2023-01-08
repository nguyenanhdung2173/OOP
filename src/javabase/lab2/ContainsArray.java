package javabase.lab2;

import java.util.Scanner;

public class ContainsArray {
    public static boolean contains(int[] array, int key) {
        if (array == null || array.length == 0) return false;

        for (int value :
                array) {
            if (key == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of items: ");
        int n = sc.nextInt();

        int[] array = new int[n]; // creat array
        System.out.print("Enter the value of items: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter a key: ");
        int key = sc.nextInt();
        sc.close();

        if (contains(array, key)){
            System.out.printf("%d is contain", key);
        } else {
            System.out.printf("%d is not contain", key);
        }

    }
}
