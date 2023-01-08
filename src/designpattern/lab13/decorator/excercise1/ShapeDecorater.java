package designpattern.lab13.decorator.excercise1;

public abstract class ShapeDecorater implements Shape {
    protected Shape shape;

    public ShapeDecorater(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
}
