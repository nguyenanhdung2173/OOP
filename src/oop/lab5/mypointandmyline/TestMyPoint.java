package oop.lab5.mypointandmyline;

import java.util.Arrays;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];
        Arrays.setAll(points, i -> new MyPoint(i, i));
        for (MyPoint point : points) {
            System.out.println(point);
        }

        // Test setters
        points[1].setX(8);
        points[1].setY(6);
        points[2].setXY(6, 8);
        System.out.println(points[1]);
        System.out.println(points[2]);

        // Test distance
        System.out.println(points[1].distance());
        System.out.println(points[1].distance(-2,-2));
        System.out.println(points[1].distance(points[2]));
    }
}
