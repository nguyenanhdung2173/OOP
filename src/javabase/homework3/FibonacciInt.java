package javabase.homework3;

public class FibonacciInt {
    public static void printFibonacciInt() {
        int f1 = 1;
        int f2 = 1;
        System.out.printf("F(%1d) = %d \n", 0, f1);
        System.out.printf("F(%1d) = %d \n", 1, f2);
        int fn = f1 + f2;
        System.out.printf("F(%1d) = %d \n", 2, fn);
        int i = 3;
        while (true) {
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
            if (Integer.MAX_VALUE - f1 < f2) {
                System.out.printf("F(%1d) is out of the range of int. \n", i);
                break;
            }
            System.out.printf("F(%1d) = %d \n", i, fn);
            i++;
        }
    }

    public static void main(String[] args) {
        printFibonacciInt();
    }
}
