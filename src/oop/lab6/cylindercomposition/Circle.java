package oop.lab6.cylindercomposition;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        StringBuilder des = new StringBuilder();
            des.append("Circle{")
                    .append("radius=")
                    .append(this.radius)
                    .append(", color= ")
                    .append(this.color)
                    .append('}');
        return des.toString();
    }
}
