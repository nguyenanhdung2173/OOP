package designpattern.lab12.factory.abstractfactory.excercise2.factories;

public class FactoryProducer {
    public AbstractFactory getFactory(String type) {
        if (type.equals("Rectangle")) {
            return new RectangleFactory();
        }
        return new SquareFactory();
    }
}
