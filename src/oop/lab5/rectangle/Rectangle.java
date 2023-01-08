package oop.lab5.rectangle;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float lenght, float width) {
        this.length = lenght;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Rectangle[length = ")
                .append(this.length)
                .append(", width = ")
                .append(this.width)
                .append("]");
        return description.toString();
    }
}
