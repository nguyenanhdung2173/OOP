package oop.lab5.myTriangleandmypoint;
import oop.lab5.mypointandmyline.MyPoint;

public class MyTriangle {
    private final MyPoint v1;
    private final MyPoint v2;
    private final MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("MyTriangle[v1 = ")
                .append(v1.toString())
                .append(", v2 = ")
                .append(v2.toString())
                .append(", v3 = ")
                .append(v3.toString())
                .append("]");
        return description.toString();
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        double e1 = v2.distance(v3);
        double e2 = v3.distance(v1);
        double e3 = v1.distance(v2);
        if (e1 == e2 && e2 == e3) return "Equilateral";
        if (e1 == e2 || e2 == e3 || e3 == e1) return "Isosceles";
        return "Scalene";
    }
}
