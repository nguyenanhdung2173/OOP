package oop.lab6.shape;

public class ShapeManager {
    private int capacity;
    Shape[] shapes;
    private int avaliableIndex;
    public ShapeManager() {
        this.capacity = 10;
        shapes = new Shape[this.capacity];
        avaliableIndex = 0;
    }
    public void add(Shape shape) {
        shapes[avaliableIndex] = shape;
        avaliableIndex ++;
    }

    public Circle[] filterCircle() {
        Circle[] circles = new Circle[this.shapes.length];
        int appendIndex = 0;
        for (int i = 0; i < avaliableIndex; i++) {
            if (shapes[i] instanceof Circle) {
                circles[appendIndex++] = (Circle) shapes[i];
            }
        }
        return circles;
    }
    public void printArea() {
        for (int i = 0; i < avaliableIndex; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.println(((Circle) shapes[i]).getArea());
            } else if (shapes[i] instanceof Rectangle) {
                System.out.println(((Rectangle) shapes[i]).getArea());
            }
        }
        // da hinh
        for (int i = 0; i < avaliableIndex; i++) {
            System.out.println(shapes[i].getArea());
        }
    }

    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();

        Circle shape1 = new Circle();
        shapeManager.add(shape1);

        Rectangle shape2 = new Rectangle();
        shapeManager.add(shape2);

        shapeManager.printArea();
    }
}
