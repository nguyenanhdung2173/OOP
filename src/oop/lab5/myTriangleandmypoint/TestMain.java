package oop.lab5.myTriangleandmypoint;

public class TestMain {
    public static void main(String[] args) {
        MyTriangle myTriangle = new MyTriangle(0, 0, 3, 0, 1, 2);
        System.out.println(myTriangle);
        System.out.println(myTriangle.getType());
        System.out.println("perimeter is: " + myTriangle.getPerimeter());
    }
}
