package oop.lab7.shape;

public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Circle(3.5, "red", false);
        System.out.println(shape1);
        System.out.println("Area :" + shape1.getArea());
        System.out.println("Perimeter :" + shape1.getPerimeter());

        Circle circle1 = (Circle) shape1;
        System.out.println(circle1);
        System.out.println("Area :" + shape1.getArea());
        System.out.println("Perimeter :" + shape1.getPerimeter());


        Square square = new Square(2.0);
        System.out.println(square);

    }
}
