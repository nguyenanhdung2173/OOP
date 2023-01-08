package oop.lab5.myrectangleandmypoint;
import oop.lab5.mypointandmyline.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint botRight) {
        this.topLeft = topLeft;
        this.bottomRight = botRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getTopLeftX() {
        return topLeft.getX();
    }

    public void setTopLeftX(int x) {
        topLeft.setX(x);
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public void setTopLeftY(int y) {
        topLeft.setY(y);
    }

    public int getBottomRightX() {
        return bottomRight.getX();
    }

    public void setBottomRightX(int x) {
        bottomRight.setX(x);
    }

    public int getBottomRightY() {
        return bottomRight.getY();
    }

    public void setBottomRightY(int y) {
        bottomRight.setY(y);
    }

    public int[] getTopLeftXY() {
        return topLeft.getXY();
    }

    public void setTopLeftXY(int x, int y) {
        topLeft.setXY(x, y);
    }

    public int[] getBottomRightXY() {
        return bottomRight.getXY();
    }

    public void setBottomRightXY(int x, int y) {
        bottomRight.setXY(x, y);
    }

    public double getArea() {
        int length = bottomRight.getX() - topLeft.getX();
        int width = topLeft.getY() - bottomRight.getY();
        return Math.abs(length * width);
    }

    public double getPerimeter() {
        int length = Math.abs(bottomRight.getX() - topLeft.getX());
        int width = Math.abs(topLeft.getY() - bottomRight.getY());
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        StringBuilder desription = new StringBuilder();
        desription.append("Rectangle[topLeft = ")
                .append(topLeft.toString())
                .append(", bottomRight = ")
                .append(bottomRight.toString())
                .append("]");
        return desription.toString();
    }
}
