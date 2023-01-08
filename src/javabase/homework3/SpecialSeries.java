package javabase.homework3;

import java.util.Scanner;

public class SpecialSeries {
    public static double specialSeries(double x, int numTerms) {
        double term = (x >= -1 && x <= 1) ? x : Double.NaN;
        double sum = x;
        for (int i = 1; i <= numTerms; i++) {
            term = ((term * x * x) * (2 * i - 1)) / ((2 * i) * (2 * i + 1));
            sum += term;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a x: ");
        double x = sc.nextDouble();
        System.out.println("Enter a num terms: ");
        int numTerms = sc.nextInt();

        System.out.println("value of special series: " + specialSeries(x, numTerms));
    }
}
