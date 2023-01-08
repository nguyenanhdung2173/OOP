package oop.lab6.point;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<Point2D> points = new ArrayList<>();
        Point2D point1 = new Point3D(1,2,3);
        Point2D point2 = new Point3D(1,2,4);
        points.add(point1);
        points.add(point2);

        for (Point2D point : points) {
            System.out.println(point);
        }
    }
}
