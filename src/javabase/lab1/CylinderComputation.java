package javabase.lab1;

import java.util.Scanner;

public class CylinderComputation {
    public static double calcBaseArea(double radius){
        return Math.PI * radius * radius;
    }

    public static double calcSurfaceArea(double radius){
        return 2.0 * Math.PI * radius + 2.0 * calcBaseArea(radius);
    }

    public static double calcVolume(double radius, double height){
        return calcBaseArea(radius) * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.printf("base area: %.2f%n", calcBaseArea(radius));
        System.out.printf("surface area: %.2f%n", calcSurfaceArea(radius));
        System.out.printf("volume: %.2f%n", calcVolume(radius, height));
    }
}
