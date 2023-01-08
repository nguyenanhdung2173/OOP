package oop.lab5.mycircleandmypoint;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] set = new int[2];
        set[0] = x;
        set[1] = y;
        return set;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("(")
                .append(this.x)
                .append(",")
                .append(this.y)
                .append(")");
        return description.toString();
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(MyPoint another) {
        return Math.sqrt((this.x - another.x) * (this.x - another.x) + (this.y - another.y) * (this.y - another.y));
    }

    public double distance() {
        return Math.sqrt((this.x - 0) * (this.x - 0) + (this.y - 0) * (this.y - 0));
    }
}
