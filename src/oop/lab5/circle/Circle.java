package oop.lab5.circle;

public class Circle {
    private double radius ;
    private String color;
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCirumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Circle")
                .append("[")
                .append("radius = ")
                .append(this.radius)
                .append(", ")
                .append(" color = ")
                .append(this.color)
                .append("]");
        return str.toString();
    }
}
