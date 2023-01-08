package javabase.lab1;

public class Factorial {
    public static void main(String[] args) {
        int n = 20;
        int factorial = 1;
        int max = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            if (factorial > max) break;
        }
        System.out.println("The Factorial of "+ n + " is " + factorial);
    }
}
