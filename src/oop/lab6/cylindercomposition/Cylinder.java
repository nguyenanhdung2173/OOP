package oop.lab6.cylindercomposition;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * base.getArea()
                + 2 * Math.PI * base.getRadius() * this.height;
    }

    public double getVolume() {
      return Math.PI * base.getRadius() * base.getRadius() * this.height;
    }

    @Override
    public String toString() {
        StringBuilder des = new StringBuilder("Cylinder[")
                .append(base.toString())
                .append(", height = ")
                .append(this.height)
                .append("]");
        return des.toString();
    }
}
