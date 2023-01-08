package javabase.lab2;

import java.util.Scanner;

public class Print {
    public static void print(int[] array) {
        if (array == null || array.length == 0) System.out.println("invalid input!!");

        StringBuffer str = new StringBuffer();
        str.append("[");
        for (int i = 0; i < array.length - 1; i++) {
            str.append(array[i] + ", ");
        }
        str.append(array[array.length - 1] + "]");

        System.out.print("Array: ");
        System.out.println(str.toString());
    }

    public static void print(double[] array) {
        if (array == null || array.length == 0) System.out.println("invalid input!!");

        StringBuffer str = new StringBuffer();
        str.append("[");
        for (int i = 0; i < array.length - 1; i++) {
            str.append(array[i] + ", ");
        }
        str.append(array[array.length - 1] + "]");

        System.out.print("Array: ");
        System.out.println(str.toString());
    }

    public static void print(float[] array) {
        if (array == null || array.length == 0) System.out.println("invalid input!!");

        StringBuffer str = new StringBuffer();
        str.append("[");
        for (int i = 0; i < array.length - 1; i++) {
            str.append(array[i] + ", ");
        }
        str.append(array[array.length - 1] + "]");

        System.out.print("Array: ");
        System.out.println(str.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of items: ");
        int n = sc.nextInt();

        int[] array = new int[n]; // creat array size n

        System.out.print("Enter the value of items: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        print(array);
    }
}
