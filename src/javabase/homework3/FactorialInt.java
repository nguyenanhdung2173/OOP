package javabase.homework3;

public class FactorialInt {
    public static void printFactorialInt() {
        int i = 1;
        int fn = 1;
        while (true) {
            System.out.printf("The factorial integer of %1$d is %2$d. \n", i, fn);
            if (Integer.MAX_VALUE / fn < (i + 1)) {
                System.out.printf("The factorial integer of %d is out of range. \n", i + 1);
                break;
            }
            i++;
            fn *= i;
        }
    }

    public static void printFactorialLong() {
        long i = 1;
        long fn = 1;
        while (true) {
            System.out.printf("The factorial integer of %1$d is %2$d. \n", i, fn);
            if (Long.MAX_VALUE / fn < (i + 1)) {
                System.out.printf("The factorial of %d is out range. \n", (i + 1));
                break;
            }
            i++;
            fn *= i;
        }
    }

    public static void main(String[] args) {
        //printFactorialInt();
        printFactorialLong();
    }
}
