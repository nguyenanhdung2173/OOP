package oop.lab6.point;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        x = 0.0f;
        y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = new float[]{this.x, this.y};
        return xy;
    }

    @Override
    public String toString() {
        StringBuilder des = new StringBuilder("(")
                .append(this.x)
                .append(", ")
                .append(this.y)
                .append(")");
        return des.toString();
    }
}
