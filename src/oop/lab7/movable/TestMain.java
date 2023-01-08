package oop.lab7.movable;

public class TestMain {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1,2,3,4,2,3 );
        System.out.println(rectangle);
        rectangle.moveDown();
        System.out.println(rectangle);
        rectangle.moveUp();
        System.out.println(rectangle);


        MovableCircle circle = new MovableCircle(2,3,2,2, 2);
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);

        MovablePoint point = new MovablePoint(1,2,3,3);
        System.out.println(point);
        point.moveRight();
        System.out.println(point);
    }
}
