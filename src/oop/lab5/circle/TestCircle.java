package oop.lab5.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(2.0, "blue");
        System.out.println(circle2);
    }
}
