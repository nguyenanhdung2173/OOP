package designpattern.lab12.factory.factorymethod.excercise2;

public class FruitFactory {
    public Fruit provideFruit(String type) {
        if (type.equals("Apple")) {
            return new Apple();
        } else if (type.equals("Banana")) {
            return new Banana();
        } else if (type.equals("Orange")){
            return new Orange();
        }
        return null;
    }
}
