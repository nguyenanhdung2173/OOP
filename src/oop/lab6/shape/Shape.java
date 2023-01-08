package oop.lab6.shape;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return 1.0;
    }

    @Override
    public String toString() {
        StringBuilder des = new StringBuilder("Shape[color = ")
                .append(this.color)
                .append(", filled = ")
                .append(this.filled);
        return des.toString();
    }
}
