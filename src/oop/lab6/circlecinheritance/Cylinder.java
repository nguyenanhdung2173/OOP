package oop.lab6.circlecinheritance;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        height = 1.0;
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
        height = 1.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea()  * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + ", height = " + this.height;
    }
}
