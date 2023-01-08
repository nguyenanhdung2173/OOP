package javabase.lab1;

import java.util.Scanner;

public class CircleComputation {

    public static double calcDiameter(double radius) {
        return radius * 2;
    }

    public static double calcCircumference(double radius) {
        return 2 * radius * Math.PI;
    }

    public static double calcArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        System.out.printf(" diameter = %.2f%n" , calcDiameter(radius));
        System.out.printf(" cicumference = %.2f%n" , calcCircumference(radius));
        System.out.printf(" Area = %.2f%n" , calcArea(radius));
    }
}
