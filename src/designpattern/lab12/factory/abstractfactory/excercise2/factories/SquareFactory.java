package designpattern.lab12.factory.abstractfactory.excercise2.factories;

import designpattern.lab12.factory.abstractfactory.excercise2.shape.Shape;
import designpattern.lab12.factory.abstractfactory.excercise2.shape.square.RoundedSquare;
import designpattern.lab12.factory.abstractfactory.excercise2.shape.square.SquareFormal;

public class SquareFactory implements AbstractFactory{

    @Override
    public Shape getShape(String type) {
        if (type.equals("Square")) {
            return new SquareFormal();
        } else if (type.equals("Rounded Square")) {
            return new RoundedSquare();
        } else {
            return null;
        }
    }

}
