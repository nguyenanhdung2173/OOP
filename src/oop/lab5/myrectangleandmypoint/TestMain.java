package oop.lab5.myrectangleandmypoint;
import oop.lab5.mypointandmyline.MyPoint;
import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(2, 3);
        MyPoint botRight = new MyPoint(5, 6);

        MyRectangle rectangle = new MyRectangle(topLeft, botRight);
        System.out.println(rectangle);
        System.out.println("topLeft is: " + rectangle.getTopLeft());
        System.out.println("botRight is: " + rectangle.getBottomRight());
        System.out.println("topLeft is: " + topLeft);
        System.out.println("botRight is: " + botRight);

        rectangle.setTopLeftX(1);
        rectangle.setTopLeftY(2);
        rectangle.setBottomRightX(3);
        rectangle.setBottomRightY(4);
        System.out.println(rectangle.getTopLeftX());
        System.out.println(rectangle.getTopLeftY());
        System.out.println(rectangle.getBottomRightX());
        System.out.println(rectangle.getBottomRightY());

        rectangle.setTopLeft(topLeft);
        rectangle.setBottomRight(botRight);
        System.out.println(Arrays.toString(rectangle.getTopLeftXY()));
        System.out.println(Arrays.toString(rectangle.getBottomRightXY()));

        rectangle.setTopLeftXY(1, 3);
        rectangle.setBottomRightXY(4, 2);
        System.out.println(rectangle);

        MyRectangle rectangle1 = new MyRectangle(7, 8, 9, 10);
        System.out.println(rectangle1);
        System.out.println("area is: " + rectangle1.getArea());
        System.out.println("perimeter is: " + rectangle1.getPerimeter());
    }
}
