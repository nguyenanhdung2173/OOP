package designpattern.lab12.factory.abstractfactory.excercise2.factories;


import designpattern.lab12.factory.abstractfactory.excercise2.shape.Shape;

public interface AbstractFactory {
    public abstract Shape getShape(String type);
}
