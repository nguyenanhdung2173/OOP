package javabase.lab2;

import java.util.Scanner;

public class SearchArray {
    public static int search(int[] array, int key) {
        assert array != null;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                index = i;
                break;
            }
        }
        return index;
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

        System.out.print("Index key in array : " + search(array, key));
    }
}
