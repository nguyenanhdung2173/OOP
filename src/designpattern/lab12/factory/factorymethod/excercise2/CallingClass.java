package designpattern.lab12.factory.factorymethod.excercise2;

public class CallingClass {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit apple = fruitFactory.provideFruit("Apple");
        Fruit banana = fruitFactory.provideFruit("Banana");
        Fruit orange = fruitFactory.provideFruit("Orange");

        apple.produceJuice();
        banana.produceJuice();
        orange.produceJuice();
    }
}
