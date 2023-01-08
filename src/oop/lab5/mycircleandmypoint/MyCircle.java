package oop.lab5.mycircleandmypoint;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        center = new MyPoint(0,0);
    }

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        return new int[]{center.getX(), center.getY()};
    }

    public void setCenterXY(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    @Override
    public String toString() {
        StringBuilder discription = new StringBuilder();
        discription.append("MyCircle[radius = ")
                .append(this.radius)
                .append(", center = ")
                .append(center.toString())
                .append("]");
        return discription.toString();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.getCenter());
    }
}
