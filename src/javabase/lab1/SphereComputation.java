package javabase.lab1;
import java.util.Scanner;

public class SphereComputation {

    public static double calcSufaceArea(double radius){
        return 4 * Math.PI * radius * radius;
    }

    public static double calcVolume(double radius) {
        return (4/3) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        System.out.printf( " Surface Area: %.2f%n", calcSufaceArea(radius));
        System.out.printf(" volume : %.2f%n", calcVolume(radius));
    }
}
