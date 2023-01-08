package designpattern.lab12.factory.abstractfactory.excercise2.factories;

import designpattern.lab12.factory.abstractfactory.excercise2.shape.Shape;
import designpattern.lab12.factory.abstractfactory.excercise2.shape.rectangle.RectangleFormal;
import designpattern.lab12.factory.abstractfactory.excercise2.shape.rectangle.RoundedRectangle;

public class RectangleFactory implements AbstractFactory{
    @Override
    public Shape getShape(String type) {
        if (type.equals("Rectangle")) {
            return new RectangleFormal();
        } else if (type.equals("Rounded Rectangle")) {
            return new RoundedRectangle();
        } else {
            return null;
        }
    }

}
