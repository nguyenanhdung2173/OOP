package javabase.lab2;

import java.util.Scanner;

public class MagicSum {
    public static Scanner sc = new Scanner(System.in);
    public static final int SENTINEL = -1;

    public static boolean isEight(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit == 8) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    public static int sumNumberMagic() {
        System.out.print("Enter a positive integer (or -1 to end):");
        int number = sc.nextInt();
        int sum = 0;
        while (number != SENTINEL) {
            if (isEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = sc.nextInt();
        }
        sc.close();
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The magic sum is: " + sumNumberMagic());
    }
}
