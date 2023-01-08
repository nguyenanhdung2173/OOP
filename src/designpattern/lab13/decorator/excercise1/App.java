package designpattern.lab13.decorator.excercise1;

public class App {
    public static void main(String[] args) {
        Shape shape = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();


        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();
    }
}
