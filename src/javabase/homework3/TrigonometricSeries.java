package javabase.homework3;

import java.util.Scanner;

public class TrigonometricSeries {
    /****** * n ******** x^(2i + 1)**
     sin(x) ≈ ∑ (-1)^i × ——————————**
     ****** *i=0 ******* (2i + 1)! **
     */
    public static double sin(double x, int numTerms) {
        // conver to radian
        x = x * (3.14 / 180);
        double term = x;
        double sum = x;
        for (int i = 1; i <= numTerms; i++) {
            term = (term * (-1) * x * x) / (2 * i * (2 * i + 1));
            sum += term;
        }
        return sum;
    }

    // ****** * n ******** x^(2i)**
    // cos(x) ≈ ∑ (-1)^i × ——————**
    // ****** *i=0 ******* (2i)! **
    // ****************************
    public static double cos(double x, int numTerms) {
        // convert to radian
        x = x * (3.14 / 180);
        double term = 1;
        double sum = 1;
        for (int i = 1; i <= numTerms; i++) {
            term = (term * x * x * (-1)) / ((2 * i - 1) * 2 * i);
            sum += term;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a x value: ");
        double x = sc.nextInt();
        System.out.println("Enter a num term: ");
        int numTerm = sc.nextInt();
        sc.close();

        System.out.println("format: " + Math.sin(Math.PI / 6));
        System.out.println("value of sin: " + sin(x, numTerm));
        System.out.println("format: " + Math.cos(Math.PI / 6));
        System.out.println("value of cos: " + cos(x, numTerm));
    }
}
