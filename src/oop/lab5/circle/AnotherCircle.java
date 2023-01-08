package oop.lab5.circle;

public class AnotherCircle {
    private double radius;

    public AnotherCircle() {
        radius = 0.0;
    }

    public AnotherCircle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Circle[radius = ")
                .append(this.radius)
                .append("]");
        return  description.toString();
    }
}
