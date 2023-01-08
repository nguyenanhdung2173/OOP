package oop.lab7.resizable;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new ResizableCircle(10);
        System.out.println(circle);
        System.out.println("Area : " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        ResizableCircle circle1 = (ResizableCircle) circle;
        circle1.resize(200);
        System.out.println(circle1);
        System.out.println("Area : " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
    }
}
