package designpattern.lab13.decorator.excercise1;

public class RedShapeDecorator extends ShapeDecorater {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    public void setRedBorder(Shape shape){
        System.out.println("draw red border outside shape");
    }
}
