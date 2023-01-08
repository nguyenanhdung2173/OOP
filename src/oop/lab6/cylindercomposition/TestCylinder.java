package oop.lab6.cylindercomposition;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Circle circle = new Circle(2.0, "green");
        Cylinder cylinder2 = new Cylinder(circle, 2.9);
        System.out.println(cylinder2);
        System.out.println("Area: " + cylinder2.getArea());
        System.out.println("Volume: " + cylinder2.getVolume());
    }
}
